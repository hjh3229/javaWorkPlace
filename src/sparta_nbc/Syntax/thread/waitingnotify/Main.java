package sparta_nbc.Syntax.thread.waitingnotify;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String[] itemList = {
            "MacBook", "IPhone", "AirPods", "iMac", "Mac mini"
    };
    public static AppleStore appleStore = new AppleStore();
    public static final int MAX_ITEM = 5;

    public static void main(String[] args) {

        // 가게 점원
        Runnable StoreClerk = () -> {
            while (true) {
                // 0 ~ 4 랜덤 int
                int randomItem = (int) (Math.random() * MAX_ITEM);

                // 랜덤한 위치에 재고를 넣는 메서드
                appleStore.restock(itemList[randomItem]);
                try {
                    Thread.sleep(50); // 0.05초 정지
                } catch (InterruptedException ignored) {
                }
            }
        };

        // 고객
        Runnable Customer = () -> {
            while (true) {
                try {
                    Thread.sleep(77); // 0.077초 정지
                } catch (InterruptedException ignored) {
                }

                // 랜덤한 제품 고르기
                int randomItem = (int) (Math.random() * MAX_ITEM);

                // 그 제품을 판매하는 메서드
                appleStore.sale(itemList[randomItem]);
                System.out.println(Thread.currentThread().getName() + " Purchase Item " + itemList[randomItem]);
            }
        };


        new Thread(StoreClerk, "StoreClerk").start();
        new Thread(Customer, "Customer1").start();
        new Thread(Customer, "Customer2").start();

    }
}

class AppleStore {
    private List<String> inventory = new ArrayList<>();

    public void restock(String item) {
        synchronized (this) { // 임계 영역
            while (inventory.size() >= Main.MAX_ITEM) {
                System.out.println(Thread.currentThread().getName() + " Waiting!");
                try {
                    wait(); // 재고가 꽉 차있어서 재입고하지 않고 기다리는 중!
                    Thread.sleep(333);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 재입고
            inventory.add(item);
            notify(); // 재입고 되었음을 고객에게 알려주기
            System.out.println("Inventory 현황: " + inventory.toString());
        }
    }

    public synchronized void sale(String itemName) {
        while (inventory.size() == 0) {
            System.out.println(Thread.currentThread().getName() + " Waiting! 1"); // 아래 wait과 구분하기 위해 넘버링
            try {
                wait(); // 재고가 없기 때문에 고객 대기중
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            // 고객이 주문한 제품이 있는지 확인
            for (int i = 0; i < inventory.size(); i++) {
                if (itemName.equals(inventory.get(i))) { // 리스트 안에 원하는 제품이 있으면
                    inventory.remove(itemName); // 구매
                    notify(); // 제품 하나 팔렸으니 재입고 하라고 알려주기
                    return; // 메서드 종료
                }
            }

            // 고객이 찾는 제품이 없을 경우
            try {
                System.out.println(Thread.currentThread().getName() + " Waiting! 2");
                wait();
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
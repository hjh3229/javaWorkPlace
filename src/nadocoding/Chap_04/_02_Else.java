package nadocoding.Chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 if else
        int hour = 10;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
        } else { // 그 외에 경우이면
            System.out.println("아이스 아메리카노(디카페인) +1");
        }
        System.out.println("커피 주문 완료 #1");

        hour = 10;
        boolean morningCoffee = false;
        if (hour >= 14 || morningCoffee == true) {
            System.out.println("아이스 아메리카노(디카페인) +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
    }
}

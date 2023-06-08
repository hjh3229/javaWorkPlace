package nadocoding.Chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 15;

        // if 문 내에서 하나의 문장을 실행할 때는 {} 생략 가능
        // if 문 내에서 두 개 이상의 문장을 실행할 때는 {} 생략 불가능
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #1");

        hour = 10;
        boolean morningCoffee = true;
        if (hour < 14 && morningCoffee == false) {  // 두 개 이상의 조건 입력 가능
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee) {
            System.out.println("아이스 아메리카노(디카페인) +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}

package nadocoding.Chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간
        // String 사용 시
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요");

        // 배열 선언 첫 번째 방법
        // String[] coffees = new String[4]; // 크기가 4인 coffees라는 배열 선언

        // 배열 선언 두 번째 방법
        // String coffees[] = new String[4]; // 배열 이름 뒤에 [] 붙여서도 선언 가능
//        coffees[0] = "아메리카노"; // 배열 첫 번째에 값 저장
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 배열 선언 세 번째 방법
        // String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 배열 선언 네 번째 방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println("--------------");

        System.out.println(coffees[0] + " 하나");
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "에스프레소"; // 배열 값 변경
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");
        System.out.println("주세요");

        // 다른 자료형?
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, false, true};
    }
}

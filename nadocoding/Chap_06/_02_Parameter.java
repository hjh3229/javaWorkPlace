package nadocoding.Chap_06;

public class _02_Parameter {
    // 전달값이 있는 메소드
    public static void power(int a) {  // a = Parameter, 매개변수
        int result = a * a;
        System.out.println(a + " 의 2 승은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값, parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // 2 = Argument, 인수
        power(2); // 2 의 2 승은 4
        power(3); // 3 의 2 승은 9

        powerByExp(3,3); // 3 의 3 승은 27
        powerByExp(2,5); // 2 의 5 승은 32
        powerByExp(10,0); // 10 의 0 승은 1
    }
}

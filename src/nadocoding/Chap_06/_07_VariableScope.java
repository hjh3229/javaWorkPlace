package nadocoding.Chap_06;

public class _07_VariableScope {
    public static void methodA() {
        // System.out.println(number);
        // System.out.println(result);
    }

    public static void methodB() {
        int result = 1; // 지역 변수
    }

    public static void main(String[] args) {
        int number = 3; // 지역 변수

        // System.out.println(result);

        for (int i = 0; i < 5; i++) { // i도 지역변수
            System.out.println(i);
        }

        // System.out.println(i);

        {
            int j = 0; // 지역변수
            System.out.println(j);
            System.out.println(number); // number와 같은 메소드에 있기에 사용 가능
        }
        // System.out.println(j);
    }
}

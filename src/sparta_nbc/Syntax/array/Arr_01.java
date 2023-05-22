package sparta_nbc.Syntax.array;

import java.util.Arrays;

public class Arr_01 {
    public static void main(String[] args) {
        // 얕은 복사 : 참조형 변수의 주소값만 복사하는 것
        int[] a = { 1, 2, 3, 4 };
        int[] b = a; // 얕은 복사

        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a[0]); // 출력 3  <- a 배열의 0번째 순번값도 3으로 조회됩니다.

        // 깊은 복사 : 배열의 길이나 크기같은 성질만 복사하고 주소는 따로 만드는 것

        int[] a_2 = { 1, 2, 3, 4 };
        int[] b_2 = new int[a.length];

        for (int i = 0; i < a_2.length; i++) {
            b_2[i] = a_2[i]; // 깊은 복사
        }

        b_2[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a_2[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로 입니다.

        // 1. clone() 메서드
        int[] a_3 = { 1, 2, 3, 4 };
        int[] b_3 = a_3.clone(); // 가장 간단한 방법입니다.
        // 하지만, clone() 메서드는 2차원이상 배열에서는 얕은 복사로 동작합니다!!

        // 2. Arrays.copyOf() 메서드
        int[] a_4 = { 1, 2, 3, 4 };
        int[] b_4 = Arrays.copyOf(a_4, a_4.length); // 배열과 함께 length값도 같이 넣어줍니다.

        a_4[3] = 0;
        System.out.println(a_4[3]); // 0
        System.out.println(b_4[3]); // 4
    }
}

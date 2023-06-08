package nadocoding.Chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // fori만 입력하면 자동으로 기본 틀 완성
        // 매장 방문
        System.out.println("어서오세요. 나코입니다.");
        // 또 다른 손님 입장
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        // 만약에 인사 법이 바뀜
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        // 매장의 이름이 바뀜
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");

        System.out.println("------반복문 사용-----");

        // 반복문 사용
        for (int i = 0; i < 10; i++) {
            // System.out.println("어서오세요. 나코입니다." + i);
            // System.out.println("환영합니다. 나코입니다." + i);
            System.out.println("환영합니다. 코나입니다." + i);
        }

        // 짝수만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        // 02468

        System.out.println();

        // 홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }
        // 13579

        System.out.println();

        // 숫자 거꾸로 출력
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        // 54321

        System.out.println();

        // 1부터 10까지의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지의 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지 모든 수의 총합은 " + sum + "입니다."); // 1부터 10까지 모든 수의 총합은 55입니다.
    }
}

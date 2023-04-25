package Javajigi.Calendar;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        System.out.println("두 수를 입력해 주세요");
        s1 = scanner.next();
        s2 = scanner.next();
        System.out.println(s1 + ", " + s2);
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
//        int c = a+b;
//        System.out.println(s1 + " + " + s2 + " = " + c);
//        System.out.printf("두 수의 합은 %d입니다.", a+b);
        System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a+b);
        scanner.close(); // scanner 작업을 끝낸후 필요
    }
}

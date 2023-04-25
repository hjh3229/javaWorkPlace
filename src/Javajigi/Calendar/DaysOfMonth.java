package Javajigi.Calendar;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("달을 입력해 주세요");
        int a = scanner.nextInt();
//        int b = 30;
//        int c = 31;
//        int d = 28;
//        if (a<1) {
//            System.out.println("1 이상 12 이하의 수를 입력해주세요");
//        } else if (a>12) {
//            System.out.println("1 이상 12 이하의 수를 입력해주세요");
//        } else if (a < 8) {
//            if (a == 2) {
//                System.out.printf("%d달은 %d일까지 있습니다.", a, d);
//            } else if (a%2 == 0) {
//                System.out.printf("%d달은 %d일까지 있습니다.", a, b);
//            } else {
//                System.out.printf("%d달은 %d일까지 있습니다.", a, c);
//            }
//        } else {
//            if (a % 2 == 0) {
//                System.out.printf("%d달은 %d일까지 있습니다.", a, c);
//            } else {
//                System.out.printf("%d달은 %d일까지 있습니다.", a, b);
//            }
//        }

        int[] maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.printf("%d월은 %d일까지 있습니다.", a, maxdays[a-1]);
    }
}

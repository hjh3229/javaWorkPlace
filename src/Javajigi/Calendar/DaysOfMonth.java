package Javajigi.Calendar;

import java.util.Scanner;

public class DaysOfMonth {

    public static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMaxDaysOfMonth(int month) {
        return MAX_DAYS[month - 1];
    }

    public static void main(String[] args) {
        //        int b = 30;
//        int c = 31;
//        int d = 28;
//        if (month<1) {
//            System.out.println("1 이상 12 이하의 수를 입력해주세요");
//        } else if (month>12) {
//            System.out.println("1 이상 12 이하의 수를 입력해주세요");
//        } else if (month < 8) {
//            if (month == 2) {
//                System.out.printf("%d달은 %d일까지 있습니다.", month, d);
//            } else if (month%2 == 0) {
//                System.out.printf("%d달은 %d일까지 있습니다.", month, b);
//            } else {
//                System.out.printf("%d달은 %d일까지 있습니다.", month, c);
//            }
//        } else {
//            if (month % 2 == 0) {
//                System.out.printf("%d달은 %d일까지 있습니다.", month, c);
//            } else {
//                System.out.printf("%d달은 %d일까지 있습니다.", month, b);
//            }
//        }
        String prompt = "> ";
        Scanner scanner = new Scanner(System.in);
        DaysOfMonth cal = new DaysOfMonth();

        while (true) {
            System.out.println("달을 입력해 주세요");
            System.out.print(prompt);
            int month = scanner.nextInt();
            if (month == -1) {
                break;
            }
            if (month > 12) {
                continue;
            }
            System.out.printf("%d월은 %d일까지 있습니다.", month, cal.getMaxDaysOfMonth(month));
        }

        System.out.println("반복이 종료되었습니다.");

        scanner.close();
    }
}

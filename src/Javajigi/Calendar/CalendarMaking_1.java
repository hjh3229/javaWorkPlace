package Javajigi.Calendar;

import java.util.Scanner;

public class CalendarMaking_1 {
    public static void main(String[] args) {
        String prompt = "> ";
        Scanner scanner = new Scanner(System.in);

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
            if (month < 8) {
                if (month == 2) {
                    Calendar.printCalendarCase1();
                } else if (month%2 == 0) {
                    Calendar.printCalendarCase2();
                } else {
                    Calendar.printCalendarCase3();
                }
            } else {
                if (month % 2 == 0) {
                    Calendar.printCalendarCase3();
                } else {
                    Calendar.printCalendarCase2();
                }
            }
        }

        System.out.println("반복이 종료되었습니다.");

        scanner.close();
    }
}

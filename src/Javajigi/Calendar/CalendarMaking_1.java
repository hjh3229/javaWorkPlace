package Javajigi.Calendar;

import java.util.Scanner;

public class CalendarMaking_1 {

    private final static String PROMPT = "> ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("달을 입력해 주세요");
            System.out.print(PROMPT);
            int month = scanner.nextInt();
            int year = 2023;
            if (month == -1) {
                break;
            }
            if (month > 12) {
                continue;
            }
            if (month < 8) {
                if (month == 2) {
                    Calendar.printCalendarCase1(year, month);
                } else if (month%2 == 0) {
                    Calendar.printCalendarCase2(year, month);
                } else {
                    Calendar.printCalendarCase3(year, month);
                }
            } else {
                if (month % 2 == 0) {
                    Calendar.printCalendarCase3(year, month);
                } else {
                    Calendar.printCalendarCase2(year, month);
                }
            }
        }

        System.out.println("반복이 종료되었습니다.");

        scanner.close();
    }
}

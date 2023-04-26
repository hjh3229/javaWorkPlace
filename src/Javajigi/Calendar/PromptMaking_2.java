package Javajigi.Calendar;

import java.util.Scanner;

public class PromptMaking_2 {
    private final static String PROMPT="cal> ";

    public void rumPrompt() {
        Scanner scanner = new Scanner(System.in);
        CalendarMaking_2 cal = new CalendarMaking_2();

        while (true) {
            System.out.println("년도를 입력해 주세요");
            System.out.print(PROMPT);
            int year = scanner.nextInt();
            System.out.println("달을 입력해 주세요");
            System.out.print(PROMPT);
            int month = scanner.nextInt();
            System.out.println("1일의 요일을 입력해 주세요");
            System.out.print(PROMPT);
            String day = scanner.next();
            if (month == -1) {
                break;
            }
            if (month > 12) {
                continue;
            }

            cal.printCalendar(year, month, day);
        }

        System.out.println("반복이 종료되었습니다.");

        scanner.close();
    }

    public static void main(String[] args) {
        PromptMaking_2 p = new PromptMaking_2();
        p.rumPrompt();
    }
}

package Javajigi.Calendar;
import java.util.Scanner;
public class Promptex {

    public int parseDay(String week) {
        switch (week) {
            case "su":
                return 0;
            case "mo":
                return 1;
            case "tu":
                return 2;
            case "we":
                return 3;
            case "th":
                return 4;
            case "fr":
                return 5;
            case "sa":
                return 6;
            default:
                return 0;
        }
    }

    public void rumPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendarex cal = new Calendarex();


        while (true) {
            System.out.println("년도를 입력해 주세요.");
            System.out.print("YEAR> ");
            int year = scanner.nextInt();
            System.out.println("달을 입력해 주세요.");
            System.out.print("MONTH> ");
            int month = scanner.nextInt();
            System.out.println("첫째 날의 요일을 입력하세요(su, mo, tu, we, th, fr, sa).");
            String str_weekday = scanner.next();
            int weekday = parseDay(str_weekday);
            System.out.println(str_weekday + ", " + weekday);
            if (month == -1) {
                break;
            }
            if (month > 12) {
                continue;
            }

            cal.printCalendar(year, month, weekday);
        }

        System.out.println("반복이 종료되었습니다.");

        scanner.close();
    }

    public static void main(String[] args) {
        Promptex p = new Promptex();
        p.rumPrompt();
    }
}

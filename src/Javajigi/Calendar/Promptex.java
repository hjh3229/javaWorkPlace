package Javajigi.Calendar;
import java.util.Scanner;
public class Promptex {

    public void rumPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendarex cal = new Calendarex();

        while (true) {
            System.out.println("년도를 입력해 주세요.(exit : -1)");
            System.out.print("YEAR> ");
            int year = scanner.nextInt();
            if (year == -1)
                break;
            System.out.println("달을 입력해 주세요.");
            System.out.print("MONTH> ");
            int month = scanner.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("잘못된 입력입니다.");
                break;
            }

            cal.printCalendar(year, month);
        }

        System.out.println("반복이 종료되었습니다.");

        scanner.close();
    }

    public static void main(String[] args) {
        Promptex p = new Promptex();
        p.rumPrompt();
    }
}

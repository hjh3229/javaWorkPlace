package Javajigi.Calendar;
import java.util.Scanner;
public class Promptex {

    private final static String PROMPT="cal> ";

    public void rumPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendarex cal = new Calendarex();

        while (true) {
            System.out.println("달을 입력해 주세요");
            System.out.print(PROMPT);
            int month = scanner.nextInt();
            if (month == -1) {
                break;
            }
            if (month > 12) {
                continue;
            }

            cal.printCalendar(2023, month);
        }

        System.out.println("반복이 종료되었습니다.");

        scanner.close();
    }

    public static void main(String[] args) {
        Promptex p = new Promptex();
        p.rumPrompt();
    }
}

package Javajigi.Calendar;
import java.util.Scanner;
public class Promptex {

    public void printMenu() {
        System.out.println("+----------------------+");
        System.out.println("| 1. 일정 등록");
        System.out.println("| 2. 일정 검색");
        System.out.println("| 3. 달력 보기");
        System.out.println("| h. 도움말 q. 종료");
        System.out.println("+----------------------+");
    }
    public void rumPrompt() {
        printMenu();

        Scanner scanner = new Scanner(System.in);
        Calendarex cal = new Calendarex();

        label:
        while (true) {
            System.out.println("명령 (1, 2, 3, h, q)");
            String cmd = scanner.next();
            switch (cmd) {
                case "1":
                    cmdRegister();
                    break;
                case "2":
                    cmdSearch();
                    break;
                case "3":
                    cmdCal(scanner, cal);
                    break;
                case "h":
                    printMenu();
                    break;
                case "q":
                    break label;
            }
        }

        System.out.println("Thank you. Bye~");

        scanner.close();
    }

    private void cmdCal(Scanner s, Calendarex c) {

        System.out.println("년도를 입력해 주세요.(exit : -1)");
        System.out.print("YEAR> ");
        int year = s.nextInt();

        System.out.println("달을 입력해 주세요.");
        System.out.print("MONTH> ");
        int month = s.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        c.printCalendar(year, month);
    }

    private void cmdSearch() {
    }

    private void cmdRegister() {
    }

    public static void main(String[] args) {
        Promptex p = new Promptex();
        p.rumPrompt();
    }
}

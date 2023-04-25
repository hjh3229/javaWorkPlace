package Javajigi.Calendar;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        System.out.println("일  월 화  수 목 금  토");
        System.out.println("------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }
}

class Add {
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
        System.out.println(s1 + " + " + s2 + " = " + a+b);
    }
}

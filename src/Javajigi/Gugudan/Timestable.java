package Javajigi.Gugudan;

import java.util.Scanner;

public class Timestable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] splitedvalue = inputValue.split(",");
        int first = Integer.parseInt(splitedvalue[0]);
        int second = Integer.parseInt(splitedvalue[1]);

        for(int i = 2; i <= first; i++) {
            for (int j = 1; j <= second; j++) {
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
    }
}

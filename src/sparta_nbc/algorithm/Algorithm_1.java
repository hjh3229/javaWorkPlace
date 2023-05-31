package sparta_nbc.algorithm;

import java.util.Scanner;

public class Algorithm_1 {
    public static void main(String[] args) {
        int correctAnswer = (int)(Math.random()*100 + 1);
        System.out.println("1~100 중 랜덤 숫자 하나를 정하였습니다. 과연 당신이 맞출 수 있을까요?");

        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        while (true) {
            int yourAnswer = sc.nextInt();
            System.out.println("입력한 숫자 : " + yourAnswer);
            if (yourAnswer > correctAnswer) {
                System.out.println("Down");
                cnt++;
            } else if (yourAnswer < correctAnswer) {
                System.out.println("Up");
                cnt++;
            } else if (yourAnswer == correctAnswer) {
                System.out.println("correct");
                break;
            }
        }
    }
}

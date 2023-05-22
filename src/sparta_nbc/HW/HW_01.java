package sparta_nbc.HW;
/*
요리 레시피 메모장 만들기

입력값
- 내가 좋아하는 요리 제목을 먼저 입력합니다.
- 요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해주세요. (ex. 3.5)
- 이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.

출력값
- 입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
- 이어서, 요리 별점을 소수점을 제외한 정수로만 출력해줍니다. (ex. 3)
- 바로 뒤에 정수별점을 5점만점 퍼센트로 표현했을 때 값을 실수로 출력해줍니다. (ex. 60.0%)
- 이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력 해줍니다.

ex)
입력 예시
백종원 돼지고기 김치찌개 만들기
4.5
돼지고기는 핏물을 빼주세요.
잘익은 김치 한포기를 꺼내서 잘라주세요.
냄비에 들기름 적당히 두르고 김치를 넣고 볶아주세요.
다진마늘 한스푼, 설탕 한스푼 넣어주세요.
종이컵으로 물 8컵 부어서 센불에 끓여주세요.
핏물 뺀 돼지고기를 넣어주세요.
된장 반스푼, 양파 반개, 청양고추 한개를 썰어서 넣어주세요.
간장 두스푼반, 새우젓 두스푼, 고춧가루 두스푼반 넣어주세요.
중불로 줄여서 오래 끓여주세요~!!
마지막에 파 쏭쏭 썰어서 마무리하면 돼요^^

출력 예시
[ 백종원 돼지고기 김치찌개 만들기 ]
별점 : 4 (80.0%)
1. 돼지고기는 핏물을 빼주세요.
2. 잘익은 김치 한포기를 꺼내서 잘라주세요.
3. 냄비에 들기름 적당히 두르고 김치를 넣고 볶아주세요.
4. 다진마늘 한스푼, 설탕 한스푼 넣어주세요.
5. 종이컵으로 물 8컵 부어서 센불에 끓여주세요.
6. 핏물 뺀 돼지고기를 넣어주세요.
7. 된장 반스푼, 양파 반개, 청양고추 한개를 썰어서 넣어주세요.
8. 간장 두스푼반, 새우젓 두스푼, 고춧가루 두스푼반 넣어주세요.
9. 중불로 줄여서 오래 끓여주세요~!!
10. 마지막에 파 쏭쏭 썰어서 마무리하면 돼요^^
*/

import java.util.Scanner;

public class HW_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 터미널에서 입력값을 받아오기 위해 Scanner 사용

        System.out.println("레시피 이름을 입력합니다");
        String recipe_name = scanner.nextLine();

        System.out.println("레시피의 점수를 입력합니다");
        double star = scanner.nextDouble();
        String percent = (int)(star*20)+"%"; // %형태로 만들기 위해 20을 곱한뒤 정수형으로 바꿔주기, 자동 형변환

        scanner.nextLine();

        System.out.println("레시피 10줄을 입력합니다.");
        String[][] recipe = new String[10][2]; // 두 칸짜리 자료 10줄 생성
        for (int i = 0; i < 10; i++) {
            recipe[i][0] = (i + 1) + ". "; // i 번째 줄 첫째칸은 i. 으로 지정, 문자열을 붙이면 자동 형변환
            recipe[i][1] = scanner.nextLine(); // i번째 줄 둘째칸은 레시피 적기
        }
        scanner.close(); // 뒤에는 스캐너 사용이 없으므로 닫기 // 굳이 넣을 필요는 없음.
        System.out.println();

        System.out.println("[ " + recipe_name + " ]");
        System.out.print(star);
        System.out.println(" (" + percent + ")"); // 별점 뒤에 한 칸 띄우기
        for (int i = 0; i < 10; i++) {
            System.out.println(recipe[i][0] + recipe[i][1]);
        }
    }
}

package sparta_nbc.HW;
/*
요리 레시피 메모장 만들기

입력값
저장할 자료구조명을 입력합니다. (List / Set / Map)
내가 좋아하는 요리 제목을 먼저 입력합니다.
이어서 내가 좋아하는 요리 레시피를 한문장씩 입력합니다.
입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.

출력값
입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
이어서, 입력한 모든 문장앞에 번호를 붙여서 입력 순서에 맞게 모두 출력 해줍니다.

입력 예시
Set
백종원 돼지고기 김치찌개 만들기
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
끝

출력 예시
[ Set 으로 저장된 백종원 돼지고기 김치찌개 만들기 ]
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

import java.util.*; // 어떤 형태의 자료구조든 사용하기 위해

public class HW_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력값을 받기 위한 기본 상태
        System.out.println("저장할 자료구조 명을 입렵합니다 (List/Set/Map)");
        String collection = scanner.nextLine();

        if (collection.equals("List")) { // collection이 List일 때
            // 조건에 == 대신 .equals()를 사용한 이유는 참조형 변수는 실제 값이 아닌 주소를 반환하기 때문
            ArrayList<String> list = new ArrayList<>(); // List 선택 시 ArrayList로 저장

            System.out.println("레시피 이름을 입력합니다.");
            String recipeName = scanner.nextLine();

            System.out.println("레시피를 입력합니다.");
            System.out.println("레시피 입력이 끝나면 '끝'을 입력해주세요");
            int i = 1; // 레시피가 몇 번까지 있는지 알기 위함.
            while (true) { // break가 없으면 무한 반복되도록
                String recipe = scanner.nextLine();
                if (recipe.equals("끝")) { // 끝을 입력하면 멈추고, 아니면 계속 입력
                    break;
                }
                list.add(i + ". " + recipe);
                i++; // 다음 레시피 번호 +1
            }

            System.out.println("[ " + collection + " 으로 저장된 " + recipeName + " 만들기 ]");
            for (int j = 0; j < i - 1; j++) { // 현재 i의 값은 목록 수 + 1이므로 목록 수만큼만 반복하기 위해 1을 뺌
                System.out.println(list.get(j));
            }
        } else if (collection.equals("Set")) { // collection이 Set일 때
            Set<String> set = new LinkedHashSet<>(); // Set 선택 시 Set으로 저장

            System.out.println("레시피 이름을 입력합니다.");
            String recipeName = scanner.nextLine();

            System.out.println("레시피를 입력합니다.");
            System.out.println("레시피 입력이 끝나면 '끝'을 입력해주세요");
            int i = 1; // 레시피가 몇 번까지 있는지 알기 위함.
            while (true) { // break가 없으면 무한 반복되도록
                String recipe = scanner.nextLine();
                if (recipe.equals("끝")) { // 끝을 입력하면 멈추고, 아니면 계속 입력
                    break;
                }
                set.add(i + ". " + recipe);
                i++; // 다음 레시피 번호 +1
            }

            System.out.println("[ " + collection + " 으로 저장된 " + recipeName + " 만들기 ]");
            for (String value : set) { // 목록에 있는 모든 값을 출력하기 위한 반복문
                System.out.println(value);
            }
        } else if (collection.equals("Map")) { // collection이 Map일 때
            Map<Integer,String> map = new HashMap<>(); // Map 선택 시 Map으로 저장

            System.out.println("레시피 이름을 입력합니다.");
            String recipeName = scanner.nextLine();

            System.out.println("레시피를 입력합니다.");
            System.out.println("레시피 입력이 끝나면 '끝'을 입력해주세요");
            int i = 1; // 레시피가 몇 번까지 있는지 알기 위함.
            while (true) { // break가 없으면 무한 반복되도록
                String recipe = scanner.nextLine();
                if (recipe.equals("끝")) { // 끝을 입력하면 멈추고, 아니면 계속 입력
                    break;
                }
                map.put(i, recipe);
                i++; // 다음 레시피 번호 +1
            }

            System.out.println("[ " + collection + " 으로 저장된 " + recipeName + " 만들기 ]");
            for (int j = 0; j < i - 1; j++) {
                System.out.println((j + 1) + ". " + map.get(j + 1));
            }
        }
    }
}

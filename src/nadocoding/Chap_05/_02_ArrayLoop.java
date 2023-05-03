package nadocoding.Chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
//        System.out.println(coffees[0] + " 하나");
//        System.out.println(coffees[1] + " 하나");
//        ...

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------");

        // enhanced for (for-each) 반복문
        // foreach른 통해 기본 틀 만들 수 있음
//        for (:
//             ) {
//
//        }
        for (String coffee : coffees) {  // coffees라는 배열의 값들을 순서대로 coffee 라는 문자열에 저장
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}

package nadocoding.Chap_06;

public class _08_MainMethod {
    // run -> edit Configuration -> Name => Test -> build and run => nadocoding.Chap_06._08_MainMethod
    public static void main(String[] args) { // 메인 메소드
        for (String s : args) {
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if (args.length == 1) {
            switch (args[0]) {
                case "1" :
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2" :
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }
        } else {
            System.out.println("사용법) 1~3 중 하나를 입력해주세요");
        }
    }
}

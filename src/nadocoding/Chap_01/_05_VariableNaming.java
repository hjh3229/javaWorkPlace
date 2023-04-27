package nadocoding.Chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용가능 (공백 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상의 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자
        // 6. 예약어 사용 불가 (public, static, void, int, double, float, ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "지훈"; // 이름
        String lastName = "한"; // 성
        String dateOfBirth = "2000-04-17"; // 생년월일
        String residentialAdvance = "무슨 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String _flightNo = "KE657"; // 항고 편명, 밑줄 시작 사용
//        String -flightNo = "KE657"; // - 시작 안됨

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        String item1 = "시계";
        String item2 = "가방";
//        String 3time = "전자제품"; // 숫자 시작 안됨

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
//        CODE = "USA" // final 상수는 변경 불가
    }
}

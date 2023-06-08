package nadocoding.Chap_03;

public class _Quiz_03 {
    /*
    주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오.

    1. 주민등록번호는 13자리로 구성
    2. 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
    3. 입력 데이터는 - 을 포함한 14자리의 문자열 형태

    ex)
    "901231-1234567"인 경우 901231-1 까지만 출력
    "030708-4567890"인 경우 030708-4 까지만 출력
     */
    public static void main(String[] args) {
        String num = "901231-1234567";
        System.out.println(num.substring(0,num.indexOf("-")+2));
    }
}

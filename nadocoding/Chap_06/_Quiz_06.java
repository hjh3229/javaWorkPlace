package nadocoding.Chap_06;
/*
개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오

1. 개인정보를 비공개로 전환하는 메소드 작성
2. 하나의 메소드에서 모든 동작 처리
3. 각 정보는 아래 위치부터 비공개 적용
이름 : 두번째 글자부터
주민 등록 번호 : 뒷자리 두번째 자리부터
전화번호 : 마지막 네자리

ex)
나코딩
990130-1234567
010-1234-5678

나**
990130-1******
010-1234-****

 */

public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String blur = data.substring(0, index);
        for (int i = index; i < data.length(); i++) {
            blur += "*";
        }
        return blur;
    }

    public static void main(String[] args) {
        String name = "나코딩"; // 이름
        String id = "990130-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}

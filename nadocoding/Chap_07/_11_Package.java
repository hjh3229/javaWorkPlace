package nadocoding.Chap_07;

import java.util.Random; // Random 입력시 자동으로 import되는 java 내 기본 제공 패키지

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 := 비슷한 유형끼리 묶어놓은 폴더의 유형
        // import 다른 패키지의 클래스를 불러오기 위해 패키지와 클래스를 언급하는 것
        // import Chap_07.BlackBox          // Chap_07에서 BlackBox 클래스 import
        // import Chap_07.BlackBoxRefurbish // Chap_07에서 BlackBoxRefurbish 클래스 import
        // import Chap_07.*                 // Chap_07에서 모든 클래스 import

        // 랜덤 클래스
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int 범위 내에서 무작위 정수형 값 반환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); // 0 이상 10 미만의 무작위 정수형 값 반환
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만의 무작위 실수형 값 반환
        // System.out.println("랜덤 실수 (범위) : " + random.nextDouble(10.0)); // 실수형은 범위 지정 불가

        // 만약 5.0 이상 10.0 미만의 변수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min)) * random.nextDouble());

        System.out.println("랜덤 boolean : " + random.nextBoolean()); // true, boolean 무작위 반환

        // 로또 번호를 뽑으려면? 1~45
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1)); // 1 이상 46 미만의 정수 = 1이상 45 이하의 정수

        // 그 외에도 기본으로 제공하는 클래스들
        // Math(수학 계산 관련), Scanner(입력), StringBuilder, StringBuffer, StringTokenizer(문자열 관련)
        // BigInteger(큰 수에 대한 연산), BigDecimal(오차가 없는 실수 계산)
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, ... (날짜 관련)
    }
}

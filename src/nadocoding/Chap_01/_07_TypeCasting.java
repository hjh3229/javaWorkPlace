package nadocoding.Chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        // int score = 93 + 98.8; // 정수형에 실수형 더하려고 해서 오류
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float, double to int
        float score_f = 93.5f;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 98.8;
        System.out.println(score); // 191

        score_d = (double) 93 + 98.8; // (double) 생략가능
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환)

        // int convertedScoreInt = score_d; // 오류 발생
        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println(s1); // 93
        s1 = Integer.toString(93);
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        System.out.println(s2); // 98.8
        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        // int error = Integer.parseInt("java");
        // System.out.println(error);
//        Exception in thread "main" java.lang.NumberFormatException: For input string: "java"
//        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//        at java.lang.Integer.parseInt(Integer.java:580)
//        at java.lang.Integer.parseInt(Integer.java:615)
//        at nadocoding.Chap_01._07_TypeCasting.main(_07_TypeCasting.java:54)
    }
}

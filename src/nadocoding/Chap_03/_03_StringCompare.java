package nadocoding.Chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s2.equals("python")); // false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 X // true

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234"; // s1, s2가 참조함
        System.out.println(s1.equals(s2)); // true // 내용을 비교
        System.out.println(s1 == s2); // true // 참조를 비교

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true // 내용을 비교하면 같으므로 true
        System.out.println(s1 == s2); // false // new로 새롭게 메모리를 할당해 만든 변수이기에 참조가 달라서 false
    }
}

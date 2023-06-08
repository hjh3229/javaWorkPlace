package nadocoding.Chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // I LIKE JAVA AND PYTHON AND C.
        System.out.println(s.toLowerCase()); // i like java and python and c.

        // 포함 관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#")); // false
        System.out.println(s.indexOf("Java")); // 7
        System.out.println(s.indexOf("C#")); // -1
        System.out.println(s.indexOf("and")); // 12
        System.out.println(s.lastIndexOf("and")); // 23
        System.out.println(s.startsWith("I like")); // true
        System.out.println(s.endsWith(".")); // true
    }
}

package nadocoding.Chap_08.Reporter;

// _02

public interface Reportable {
    public static final String name = "감지자"; // 인터페이스에서 생성되는 변수는 public static final을 자동으로 생략한다.
    public abstract void report(); // 신고 // 인터페이스에서 생성되는 메소드는 public abstract를 자동으로 생략한다.
}

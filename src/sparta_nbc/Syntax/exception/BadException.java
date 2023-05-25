package sparta_nbc.Syntax.exception;

// 예외 클래스를 만들어서 예외를 정의
public class BadException extends Exception {
    public BadException() {
        super("위험한 행동을 하면 예외처리를 꼭 해야함"); // 에러 메시지
    }
}

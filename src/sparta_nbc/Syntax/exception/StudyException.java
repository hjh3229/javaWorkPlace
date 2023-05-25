package sparta_nbc.Syntax.exception;

public class StudyException {
    public static void main(String[] args) {
        UsingClass usingClass = new UsingClass();
        // usingClass.thisMethodIsDangerous(); // 위험하다고 플래그를 달아놨기 때문에 그냥 사용X

        // try ~ catch ~ finally 구문
        try { // try할 로직 입력
            usingClass.thisMethodIsDangerous();
        } catch (BadException e) { // ()안에는 어떤 예외상황을 캐치할지 적어두는 것 // 아래에서 사용할 수 있도록 객체화
            System.out.println(e.getMessage()); // 예외 발생시 실행할 코드
        } finally { // 정상적으로 실행되든 예외가 발생하든 아래 로직은 무조건 실행
            System.out.println("우리는 방금 예외를 handlig 해봤습니다");
        }
        // 위험한 행동을 하면 예외처리를 꼭 해야함 // just = true이므로 무조건 예외 발생해서 메시지 출력
        // 우리는 방금 예외를 handlig 해봤습니다 // 예외 발생 유뮤와 상관없이 출력
    }
}

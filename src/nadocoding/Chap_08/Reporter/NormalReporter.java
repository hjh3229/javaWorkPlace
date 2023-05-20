package nadocoding.Chap_08.Reporter;

// _02

public class NormalReporter implements Reportable {
    @Override // 인터페이스에서 구현한 메소드 필수 생성
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다.");
    }
}

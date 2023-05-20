package nadocoding.Chap_08.Camera;

// _01

public class FactoryCam extends Camera {
    @Override // 추상 클래스에서 구현해야 하는 추상 메소드 필수 생성
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    // _02
    public void detect() {
        System.out.println("화재를 감지합니다.");
    }

    public void report() {
        System.out.println("화재 신고를 진행합니다.");
    }
}

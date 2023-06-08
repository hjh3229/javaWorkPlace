package nadocoding.Chap_07.Camera;

public class FactoryCam extends Camera { // 자식 클래스
    // _12
    public FactoryCam() {
        // this.name = "공장 카메라";
        // _15
        super("공장 카메라");
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    // _13
    public void showMainFeature() {
        System.out.println(this.name + " 의 주요 기능 : 화재 감지");
    }

    // _15
    public void recordVideo() {
        // 동영상 녹화
        super.recordVideo();
        detectFire();
    }
}

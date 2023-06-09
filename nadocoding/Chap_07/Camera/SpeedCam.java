package nadocoding.Chap_07.Camera;

public class SpeedCam extends Camera { // 자식 클래스
    // _12
    public SpeedCam() {
        // this.name = "과속단속 카메라";
        // _15
        super("과속단속 카메라");
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    // _13
    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + " 의 주요 기능 : 속도 측정, 번호 인식");
    }

    // _15
    public void takePicture() {
        // 사진 촬영
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }
}

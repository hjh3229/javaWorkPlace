package nadocoding.Chap_07.Camera;

public class Camera { // 부모 클래스
    // _12
    public String name;

    // 상단 메뉴바 -> Code -> Generate == Alt + Insert -> Constructor
//    public Camera() {
//        this.name = "카메라";
//    }

    public void takePicture() {
        // 사진 촬영
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    // _13
    public void showMainFeature() {
        System.out.println(this.name + " 의 주요 기능 : 사진 촬영, 동영상 녹화");
    }

    // _15
    public Camera() {
        this("카메라");
    }

    protected Camera(String name) {
        this.name = name;
    }
}

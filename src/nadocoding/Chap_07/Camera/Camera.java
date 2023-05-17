package nadocoding.Chap_07.Camera;

public class Camera { // 부모 클래스
    // _12
    public String name;

    // 상단 메뉴바 -> Code -> Generate == Alt + Insert -> Constructor
    public Camera() {
        this.name = "카메라";
    }

    public void takePicture() {
        // 사진 촬영
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }
}

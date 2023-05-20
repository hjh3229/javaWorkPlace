package nadocoding.Chap_08.Camera;

// _01
public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature(); // 추상 메소드는 선언만하고 함수를 따로 만들지 않음, 자식 클래스에서 구현해야 한다.
}


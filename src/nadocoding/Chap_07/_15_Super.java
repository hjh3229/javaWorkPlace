package nadocoding.Chap_07;

import nadocoding.Chap_07.Camera.FactoryCam;
import nadocoding.Chap_07.Camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super 오버라이딩을 하면서도 부모 클래스의 기능을 유지하기 위함
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("---------------------");
        speedCam.takePicture();
    }
}

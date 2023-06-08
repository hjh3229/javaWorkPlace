package nadocoding.Chap_07;

import nadocoding.Chap_07.Camera.Camera;
import nadocoding.Chap_07.Camera.FactoryCam;
import nadocoding.Chap_07.Camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속 // 자식 클래스 옆에 'extends 부모클래스'를 붙인다.
        // 상속은 하나의 부모 클래스로부터만 상속 받을 수 있다.
        // ex) public class SpeedCam extends Camera
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}

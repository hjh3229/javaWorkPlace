package nadocoding.Chap_07;

import nadocoding.Chap_07.Camera.Camera;
import nadocoding.Chap_07.Camera.FactoryCam;
import nadocoding.Chap_07.Camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성
        // FactoryCam is a Camera, SpeedCam is a Camera => IS-A 관계

        // class Person : 사람
        // class Student extends Person : 학생은 사람이다 (Student is a Person)
        // class Teacher extends Person : 선생은 사람이다 (Teacher is a Person)

        // 부모 클래스는 자신의 객체 뿐만이 아니라 자식 클래스의 객체도 만들 수 있다.
        Camera camera = new Camera();
        //FactoryCam factoryCam = new FactoryCam();
        Camera factoryCam = new FactoryCam();
        //SpeedCam speedCam = new SpeedCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("---------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("---------------------------");

        // 단, 이렇게 부모 클래스를 통해 만든 객체는 자식 클래스만 가지고 있는 메서드를 호출할 수 없다.
        // factoryCam.detectFire();
        // speedCam.checkSpeed();
        // speedCam.recognizeLicensePlate();

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            // factoryCam.detectFire();
            ((FactoryCam)factoryCam).detectFire(); // factoryCam이 FactoryCam의 객체라면 detectFire을 호출할 수 있도록 형변환
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

        // 모든 클래스는 Object라는 클래스의 자식 클래스이므로 아래와 같은 형식도 가능하다.
//        Object[] objs = new Object[3];
//        objs[0] = new Camera();
//        objs[1] = new FactoryCam();
//        objs[2] = new SpeedCam();
    }
}

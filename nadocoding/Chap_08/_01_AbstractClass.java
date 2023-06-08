package nadocoding.Chap_08;

import nadocoding.Chap_08.Camera.Camera;
import nadocoding.Chap_08.Camera.FactoryCam;
import nadocoding.Chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction) : 불필요한 정보는 숨기고 필요한 정보만 공개하는 과정
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스 또는 인터페이스에서만 사용 가능한, 껍데기만 있는 메소드)

        // Camera camera = new Camera(); // abstract class 라서 직접 객체를 생성하지 못함
        FactoryCam factoryCam = new FactoryCam();
        // Camera factoryCam = new FactoryCam(); // 부모 클래스로서 자식 클래스를 통한 객체 만들기는 가능
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        // Camera speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}

package nadocoding.Chap_08.Camera;

// _01

import nadocoding.Chap_08.Detector.Detectable;
import nadocoding.Chap_08.Reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable { // implements를 통해 여러개의 상속 가능
    @Override // 추상 클래스에서 구현해야 하는 추상 메소드 필수 생성
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

//    _02
//    public void detect() {
//        System.out.println("화재를 감지합니다.");
//    }
//
//    public void report() {
//        System.out.println("화재 신고를 진행합니다.");
//    }

    private Detectable detector; // 미리 만들어놓은 FireDetector 등의 class를 이용하기 위한 과정
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}

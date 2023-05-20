package nadocoding.Chap_08.Camera;

// _01

import nadocoding.Chap_08.Detector.Detectable;
import nadocoding.Chap_08.Reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {
    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    // _02
//    public void detect() {
//        System.out.println("사고를 감지합니다.");
//    }
//
//    public void report() {
//        System.out.println("사고 신고를 진행합니다.");
//    }
    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void detect() {
        this.detector.detect();
    }

    @Override
    public void report() {
        this.reporter.report();
    }
}

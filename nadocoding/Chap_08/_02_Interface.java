package nadocoding.Chap_08;

import nadocoding.Chap_08.Camera.FactoryCam;
import nadocoding.Chap_08.Detector.AdvancedFireDetector;
import nadocoding.Chap_08.Detector.Detectable;
import nadocoding.Chap_08.Detector.FireDetector;
import nadocoding.Chap_08.Reporter.NormalReporter;
import nadocoding.Chap_08.Reporter.Reportable;
import nadocoding.Chap_08.Reporter.VideoReporter;
// import nadocoding.Chap_08.Reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 (뼈대만 제공)
        // 단일상속 (extends) 해결 가능
        NormalReporter normalReporter = new NormalReporter();
        // Reportable normalReporter = new NormalReporter();
        normalReporter.report(); //일반 화재 신고를 진행합니다.

        VideoReporter videoReporter = new VideoReporter();
        // Reportable videoReporter = new VideoReporter();
        videoReporter.report(); // 직전 30초 영상과 함께 신고를 진행합니다.

        System.out.println("----------------------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect(); // 일반 성능으로 화재를 감지합니다.

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect(); // 향상된 성능으로 화재를 감지합니다.

        System.out.println("----------------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect(); // 향상된 성능으로 화재를 감지합니다.
        factoryCam.report(); // 직전 30초 영상과 함께 신고를 진행합니다.
    }
}

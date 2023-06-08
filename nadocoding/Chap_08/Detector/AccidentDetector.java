package nadocoding.Chap_08.Detector;

public class AccidentDetector implements Detectable {
    @Override
    public void detect() {
        System.out.println("교통사고를 감지합니다.");
    }
}

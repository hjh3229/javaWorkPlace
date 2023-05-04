package nadocoding.Chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
//        BlackBox b1 = new BlackBox();
//        b1.callServiceCenter();
//
//        BlackBox b2 = new BlackBox();
//        b2.callServiceCenter();

        BlackBox.callServiceCenter(); // 클래스 변수와 마찬가지로 클래스 메소드도 클래스 명으로 접근

        // 객체마다 다른 값을 받아 다른 결과가 나올 수 있는 경우는 인스턴스 메소드, 그 외에는 클래스 메소드를 고려한다.
    }
}

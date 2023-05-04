package nadocoding.Chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이"; // 까망이(최신형)
        b1.appendModelName("(최신형)"); // 만족하는 메소드가 없는 상황에서 이름만 만들면 intellij에서는 클래스 내에 메서드를 만들 수 있도록 경고를 준다.
        // 메소드 ctrl + 클릭시 메소드가 있는 곳으로 이동, ctrl + shift + i 시 바로 코드를 볼 수 있다.
        System.out.println(b1.modelName);
    }
}

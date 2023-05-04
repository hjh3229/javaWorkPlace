package nadocoding.Chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 (Encapsulation) : 연관있는 변수, 메서드, 클래스 등 만 모아넣는 것
        // 정보은닉 (Information hiding) : 정보를 숨기는 것, 객체내에 있는 변수나 메소드의 직접적인 접근을 막는 것

        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서 접근 가능, 다른 패키지일 경우 자식 클래스(상속에서 다룸)에서 접근 가능

        // ctrl + R 을 통해 원하는 글자를 다른 글자로 한꺼번에 변경 가능
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        // b1.resolution = "FHD";
        b1.setPrice(200000); // pirce에 private을 추가해 접근이 불가능하므로 getter와 setter로만 접근해야함.
        b1.color = "블랙";

        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        System.out.println("해상도 : " + b1.resolution);

        System.out.println("---------------------");

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());


    }
}

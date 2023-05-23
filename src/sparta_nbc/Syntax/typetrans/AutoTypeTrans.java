package sparta_nbc.Syntax.typetrans;

public class AutoTypeTrans {
    public static void main(String[] args) {
        // 고래는 포유류이기 때문에 포유류 타입으로 변환될 수 있습니다.
        // Mammal mammal = new Whale();
        Mammal whale = new Whale();

        // 생성자는 Whale이어도 Mammal로 객체를 생성했기에 상속받지 않은 메서드는 사용할 수 없다.
        // whale.swimming(); // 오류 발생

        // 부모타입의 객체는 자식타입의 변수로 변환될 수 없습니다.
        // Whale whale = new Mammal(); // 오류 발생

        whale.feeding();
    }
}





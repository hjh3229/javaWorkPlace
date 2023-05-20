package nadocoding.Chap_07;

/*
클래스를 이용하여 햄버거를 자동으로 만드는 프로그램을 작성하시오

1. 햄버거의 종류는 햄버거, 치즈버거, 새우버거 3가지
2. 각 버거는 각각의 클래스로 생성
3. 버거 이름을 담기 위한 name 변수 정의
4. 재료 정보를 표시하는 cock() 메소드 정의
5. 공통 부분은 상속 및 메소드 오버라이딩으로 처리
6. 모든 클래스는 하나의 파일에 정의
*/

public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();


        System.out.println("주문하신 메뉴를 만듭니다.");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cock();
            System.out.println("-----------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}

class HamBurger {
    public String name;

    public HamBurger() {
        this("햄버거");
    }

    public HamBurger(String name) {
        this.name = name;
    }

    public void cock() {
        System.out.println("재료는 양상추, 패티, 피클입니다.");
    }
}

class ShrimpBurger extends HamBurger {
    public ShrimpBurger() {
        super("새우버거");
    }

    @Override
    public void cock() {
        System.out.println("재료는 양상추, 패티, 피클, 새우입니다.");
    }
}

class CheeseBurger extends HamBurger {
    public CheeseBurger() {
        super("치즈버거");
    }

    @Override
    public void cock() {
        System.out.println("재료는 양상추, 패티, 피클, 치즈입니다.");
    }
}


package nadocoding.Chap_07;

public class Burger {
    public String name;

    public Burger() {
        this("버거");
    }

    protected Burger(String name) {
        this.name = name;
    }

    public void cock() {
        System.out.println("재료는 입니다.");
    }
}

class HamBurger extends Burger {
    public HamBurger() {
        super("햄버거");
    }

    public void cock() {
        System.out.println("재료는 양상추, 패티, 피클입니다.");
    }
}

class CheeseBurger extends Burger {
    public CheeseBurger() {
        super("치즈버거");
    }

    @Override
    public void cock() {
        System.out.println("재료는 양상추, 패티, 피클, 치즈입니다.");
    }
}

class ShrimpBurger extends Burger {
    public ShrimpBurger() {
        super("새우버거");
    }

    @Override
    public void cock() {
        System.out.println("재료는 양상추, 패티, 피클, 새우입니다.");
    }
}

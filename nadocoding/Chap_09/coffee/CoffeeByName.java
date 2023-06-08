package nadocoding.Chap_09.coffee;

public class CoffeeByName {
    public Object name; // Integer, String, Double, BlackBox, ...

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}

package nadocoding.Chap_09;

import nadocoding.Chap_09.coffee.CoffeeByNumber;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(32);
        c1.ready();
    }
}

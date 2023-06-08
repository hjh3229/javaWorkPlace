package nadocoding.Chap_09;

import nadocoding.Chap_09.coffee.Coffee;
import nadocoding.Chap_09.coffee.CoffeeByName;
import nadocoding.Chap_09.coffee.CoffeeByNickName;
import nadocoding.Chap_09.coffee.CoffeeByNumber;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickName c2 = new CoffeeByNickName("유재석");
        c2.ready();

        System.out.println("-----------------------------");
        // CoffeeByNumber나 CoffeeByNickName 모두 입력값만 다르고 수행하는 작업은 같으므로 비효율적
        // 해결방법 1. Object class를 사용
        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("-----------------------------");
        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        // c4Name = (String) c3.name; // 정수를 문자열로 형변환하려 했기에 에러가 생긴다.
        // 이와 같이 Object 클래스를 사용하면 해당 객체 값을 불러올 때마다 형변환을 해야하고,
        // 형변환을 잘 못 하면 실행 전에는 알 수 없던 에러도 발생한다.
        System.out.println("-----------------------------");
        // 해결방법 2. 제네릭 클래스 사용
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        // 이와 같이 사전에 미리 자료형을 정해줬기 때문에 다른 자료형을 넣으려고 하면 사전에 에러를 알아챌 수 있고, 유연성은 그대로다.
    }
}

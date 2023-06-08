package nadocoding.Chap_07;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        // b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        // 할인 행사 // -=을 = -로 잘못 쓴 경우
        b1.price = -5000;
        System.out.println("가격 : " + b1.price + "원");

        // 고객 문의 // resolution을 지정하지 않은 경우
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("---------------------");

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원"); // 가격 : 100000원
        System.out.println("해상도 : " + b2.getResolution()); // 해상도 : 판매자에게 문의하세요.

        // 이런식으로 getter와 setter을 이용하면 값을 지정하거나 불러올 때 발생하는 오류나 실수를 방지할 수 있다.
    }
}

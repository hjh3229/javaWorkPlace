package nadocoding.Chap_07;

import nadocoding.Chap_07.Camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data Types) : int, float, double, long, boolean, ...
        // 기본 자료형은 기본적으로 소문자로 시작
        int[] i = new int[3];
        System.out.println(i[0]); // 0


        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam, ...
        // 참조 자료형은 대문자로 설정해서 구분 (class를 대문자로 시작하는 이유)
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        System.out.println("-----------------------------");

        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a); // 10
        System.out.println(b); // 10
        b = 30;
        System.out.println(a); // 10
        System.out.println(b); // 30
        // b의 값을 바꿔도 1에는 영향이 가지 않음.
        // 기본 자료형은 각자 다른 메모리를 할당 받고 있기 때문

        System.out.println("-----------------------------");

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라2
        c2 = c1;
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라2
        c2.name = "고장난 카메라";
        System.out.println(c1.name); // 고장난 카메라
        System.out.println(c2.name); // 고장난 카메라
        // c2의 이름을 바꿨더니 c1도 바뀜
        // 참조 자료형은 각자 메모리의 주소만 할당 받는데, c2 = c1에서 c2의 주소와 c1의 주소가 같아져 c2의 값을 바꾸면
        // c2와 같은 주소를 쓰는 c1의 값도 바뀜

        System.out.println("-----------------------------");

        changeName(c2);
        System.out.println(c1.name); // 잘못된 카메라
        System.out.println(c2.name); // 잘못된 카메라

        c2 = null; // c2의 참조 없애기
        // System.out.println(c2.name); // NullPointerException 오류 발생
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라"; // 이 인스턴스도 c2가 가리키는 주소를 할당받아 c1도 영향을 받게 된다.
    }
}

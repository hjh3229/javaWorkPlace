package sparta_nbc.Syntax._instanceOf;

class Parent { }
class Child extends Parent { }


public class InstanceOf {
    public static void main(String[] args) {
        Parent p = new Parent();

        System.out.println(p instanceof Object); // true 출력
        System.out.println(p instanceof Parent); // true 출력
        System.out.println(p instanceof Child);  // false 출력

        Parent pc = new Child();

        System.out.println(pc instanceof Object); // true 출력
        System.out.println(pc instanceof Parent); // true 출력
        System.out.println(pc instanceof Child);  // true 출력 // pc가 Parent로 형변환이 되긴 했지만 원래 클래스명은 Child이므로

        Child c = new Child();

        System.out.println(c instanceof Object); // true 출력
        System.out.println(c instanceof Parent); // true 출력
        System.out.println(c instanceof Child); // true 출력
    }
}

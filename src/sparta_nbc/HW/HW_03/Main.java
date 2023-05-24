package sparta_nbc.HW.HW_03;

public class Main {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator(new AddOperation());
        System.out.println(cal1.calculate(2, 3));

        Calculator cal2 = new Calculator(new SubstractOperation());
        System.out.println(cal2.calculate(5,2));

        Calculator cal3 = new Calculator(new MultiplyOperation());
        System.out.println(cal3.calculate(4,6));

        Calculator cal4 = new Calculator(new DivideOperation());
        System.out.println(cal4.calculate(7,2));
    }
}

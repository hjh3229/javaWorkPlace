package sparta_nbc.HW.HW_03;

/*
더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만듭니다.

Step1
1. Calulator 클래스는 연산을 수행하는 반환타입이 double 인 calculate 메서드를 가지고 있습니다.
2. calculate 메서드는 String 타입의 operator 매개변수를 통해 연산자 매개값을 받습니다.
3. int 타입의 firstNumber, secondNumber 매개변수를 통해 피연산자 값을 받습니다.
4. calculate 메서드는 전달받은 피연산자, 연산자를 사용하여 연산을 수행합니다.

Step2
나머지 연산자(%)를 수행할 수 있게 Calculator 클래스 내부코드를 변경합니다.

Step3
AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기)
연산 클래스를을 만든 후 클래스간의 관계를 고려하여 Calculator 클래스와 관계를 맺습니다.
- 관계를 맺은 후 필요하다면 Calculator 클래스의 내부코드를 변경합니다.

Step4
AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기)
연산 클래스들을 AbstractOperation(추상 클래스)를 사용하여 추상화하고 Calculator 클래스의 내부 코드를 변경합니다.
*/

public class Calculator {

    // Step4
    AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }
    //Step1
    public double calculate(int firstNumber, int secondNumber) {
        double result = 0.0; // result 값 초기화
        // Step2
//        if (operator.equals("%")) {
//            result = (double) (firstNumber % secondNumber);
//        }
        // Step3
//        if (operator.equals("+")) {
//            result = AddOperation.addOperation(firstNumber, secondNumber); // static 클래스이므로 가능
//        } else if (operator.equals("-")) {
//            result = SubstractOperation.substractOperation(firstNumber, secondNumber);
//        } else if (operator.equals("*")) {
//            result = MultiplyOperation.multiplyOperation(firstNumber, secondNumber);
//        } else if (operator.equals("/")) {
//            result = DivideOperation.divideOperation(firstNumber, secondNumber);
//        }
        // 모든 조건이 .equals이므로 조건문을 switch 로 변경
        result = operation.operate(firstNumber, secondNumber);
        return result;
    }
}

// Step3
class AddOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
    }
}

class SubstractOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        double result = firstNumber - secondNumber;
        return result;
    }
}

class MultiplyOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        double result = firstNumber * secondNumber;
        return result;
    }
}

class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        double result = (double) firstNumber / secondNumber;
        return result;
    }
}

//Step4
abstract class AbstractOperation {
    abstract double operate(int firstNuber, int secondNumber);
}

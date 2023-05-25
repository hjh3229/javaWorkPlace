package sparta_nbc.HW.HW_04;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public Calculator() {
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }

}

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

abstract class AbstractOperation {
    abstract double operate(int firstNuber, int secondNumber);
}

package sparta_nbc.HW.HW_04;

import sparta_nbc.Syntax.exception.BadException;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception {
        if (!Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException("정수값"); // 새로운 메서드를 추가해 일괄적으로 처리하려 했는데 매개변수가 있다보니 구현이 힘들어 회피를 택했다.
        }

        this.calculator.setFirstNumber(Integer.parseInt(firstInput));

        return this;
    }

    public Parser parseSecondNum(String secondInput) throws Exception{
        if (!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("정수값");
        }

        this.calculator.setSecondNumber(Integer.parseInt(secondInput));

        return this;
    }

    public Parser parseOperator(String operationInput) throws Exception{
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("+, -, *, /");
        }

        switch (operationInput) {
            case "+" :
                this.calculator.setOperation(new AddOperation());
                break;
            case "-" :
                this.calculator.setOperation(new SubstractOperation());
                break;
            case "*" :
                this.calculator.setOperation(new MultiplyOperation());
                break;
            case "/" :
                this.calculator.setOperation(new DivideOperation());
                break;
        }

        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
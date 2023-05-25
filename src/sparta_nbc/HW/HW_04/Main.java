package sparta_nbc.HW.HW_04;

/*
1. **구현 1, 구현2** 로 주석처리된 부분을 직접 구현해주세요
2. 추가된 BadInputException은 우리가 이번 과제에서 사용할 예외 입니다.
3. 추가된 CalculatorApp은 우리의 계산기를 실행시켜주는 클래스 입니다.
4. Parser는 유저의 입력을 받아서 우리가 지난주에 구현한 계산기의 로직으로 전환시켜주는 객체 입니다.
5. 우리는 주로 Parser를 구현할 예정 입니다.
6. 우리는 유저의 입력을 String으로만 받아야 합니다.
7. 입력받은 String을 숫자나 연산자로 변환하기 위해서 꼭! 예외처리를 해야합니다.
8. 해당 예외처리를 하기 위해서는 Pattern.match() 메서드가 필요합니다. 해당 부분은 검색하면 알 수 있습니다.
9. Pattern.match()메서드를 사용하기 위한 정규식 표현은 코드내에 제공되어 있습니다.
10. 예외는 이미 구현된 BadInputException 객체를 사용합니다.
11. 에외를 어디에 구현 할 지는 본인이 결정 할 수 있습니다. 어디가 더 좋을지 고민해보고 좋은 위치에 구현하고 간단하게 주석으로 자기의 생각을 표현해주세요
*/

public class Main {
    public static void main(String[] args) throws Exception {
        boolean calculateEnded = false;

        while (!calculateEnded) {
            try {
                calculateEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

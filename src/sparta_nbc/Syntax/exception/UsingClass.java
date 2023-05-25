package sparta_nbc.Syntax.exception;

public class UsingClass {
    private final boolean just = true;

    // throws : 던지다 (=예외를 발생시키다)
    public void thisMethodIsDangerous () throws BadException { // throws Exception이어도 작동하지만, 더 구체적으로 나타내기 위해서
        // 위에서 이 메서드가 예외가 발생할 수 있다고 적어둠

        // custom logic
        if (just) { // 로직에 따라 만약 참이라면
            throw new BadException(); // 예외처리
        }
    }
}

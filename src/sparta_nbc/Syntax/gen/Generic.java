package sparta_nbc.Syntax.gen;

// 1. 제네릭은 class 또는 메서드에 사용 가능
// <>안에 들어가야 할 타입을 명시 String, Integer, ...
public class Generic<T> { // T로 적어놓는 이유는 관행이기 때문 Type이나 다른 이름도 상관 x (T, U, V, E가 많이 쓰임)
    // 2. 내부 필드에 String
    private T t;
    // 3. method의 return type도 String
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4. 여기서 <>에 String을 넣었으므로 위 T들이 String으로 대체됨
        Generic<String> stringGeneric = new Generic<>();
        // 5. String이 들어갔기에 아래와 같이 사용 가능
        stringGeneric.set("Hello World");

        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString); // Hello World
    }
}

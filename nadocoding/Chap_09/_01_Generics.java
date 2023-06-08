package nadocoding.Chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스 : <T>
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0,2.0,3.0,4.0,5.0};
        String[] sArray = {"A","B","C","D","E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("--------------------------------");

        printAnyArray(iArray); // 제네릭은 래퍼클래스만 지원하므로 기본형인 int와 double은 대체하지 못한다.
        printAnyArray(dArray); // 그래서 래퍼 클래스인 Integer, Double을 사용해야 한다.
        printAnyArray(sArray);
    }

    // 위와 같이 비슷한 작업을 수행하는 메서드를 여러개 반복 생성하는 것은 번거롭고 비효율적이므로 제네릭이 이를 해결해준다
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void printIntArray(Integer[] iArray){
        for (int i : iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }
}

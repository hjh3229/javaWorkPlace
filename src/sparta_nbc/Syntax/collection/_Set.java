package sparta_nbc.Syntax.collection;

import java.util.HashSet;
import java.util.Set;

public class _Set {
    public static void main(String[] args) {
        // 집합 : 순서 상관 X, 중복 허용 X
        // Set -> 그냥 쓸 수도 있으나 HashSet, TreeSet 등으로 응용해서 같이 사용 가능
        // Set은 Queue와 같이 인터페이스가 없어서 혼자 사용 불가능
        // 생성자가 존재하는 HashSet을 사용해서 구현 가능

        Set<Integer> intSet = new HashSet<>(); // 선언 및 생성

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value : intSet) {
            System.out.println(value);
        }
//        1
//        5
//        9
//        12

        // contains
        System.out.println(intSet.contains(2)); // false
        System.out.println(intSet.contains(5)); // true
    }
}

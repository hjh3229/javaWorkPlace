package sparta_nbc.Syntax.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class _List {
    public static void main(String[] args) {
        // ArrayList
        // (사용하기 위해선 import java.util.ArrayList; 를 추가해야합니다.)
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 및 생성

        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println(intList.get(0)); // 1 출력
        System.out.println(intList.get(1)); // 2 출력
        System.out.println(intList.get(2)); // 3 출력
        System.out.println(intList.toString()); // [1,2,3] 출력

        intList.set(1, 10); // 1번순번의 값을 10으로 수정합니다.
        System.out.println(intList.get(1)); // 10 출력


        intList.remove(1); // 1번순번의 값을 삭제합니다.
        System.out.println(intList.toString()); // [1,3] 출력

        intList.clear(); // 전체 값을 삭제합니다.
        System.out.println(intList.toString()); // [] 출력

        // LinkedList
        // (사용하기 위해선 import java.util.LinkedList; 를 추가해야합니다.)

        LinkedList<Integer> linkedList = new LinkedList<>(); // 선언 및 생성

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList.get(0)); // 1 출력
        System.out.println(linkedList.get(1)); // 2 출력
        System.out.println(linkedList.get(2)); // 3 출력
        System.out.println(linkedList.toString()); // [1,2,3] 출력 (속도 느림)

        linkedList.add(2, 4); // 2번 순번에 4 값을 추가합니다.
        System.out.println(linkedList); // [1,2,4,3] 출력

        linkedList.set(1, 10); // 1번순번의 값을 10으로 수정합니다.
        System.out.println(linkedList.get(1)); // 10 출력

        linkedList.remove(1); // 1번순번의 값을 삭제합니다.
        System.out.println(linkedList); // [1,4,3] 출력

        linkedList.clear(); // 전체 값을 삭제합니다.
        System.out.println(linkedList); // [] 출력

        // Stack
        // (사용하기 위해선 import java.util.Stack; 를 추가해야합니다.)

        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        while (!intStack.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intStack.pop()); // 3,2,1 출력
        }

        // 다시 추가
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        // peek()
        System.out.println(intStack.peek()); // 3 출력
        System.out.println(intStack.size()); // 3 출력 (peek() 할때 삭제 안됬음)

        // pop()
        System.out.println(intStack.pop()); // 3 출력
        System.out.println(intStack.size()); // 2 출력 (pop() 할때 삭제 됬음)

        System.out.println(intStack.pop()); // 2 출력
        System.out.println(intStack.size()); // 1 출력 (pop() 할때 삭제 됬음)

        while (!intStack.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intStack.pop()); // 1 출력 (마지막 남은거 하나)
        }
    }
}

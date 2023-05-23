package sparta_nbc.Syntax.collection;

import java.util.HashMap;
import java.util.Map;

public class _Map {
    public static void main(String[] args) {
        Map<String, Integer> intMap = new HashMap<>();

        // key 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("사", 14);
        intMap.put("사", 15); // 중복 key
        intMap.put("사", 16); // 중복 key

        // 키 값 전체 출력
        // key를 가져오는 함수 .keySet()
        for (String key : intMap.keySet()) {
            System.out.println(key);
        }
        // 이
        // 일
        // 삼
        // 사 // 중복되는 키는 나타내지 않음

        // value 값 전체 출력
        // value를 가져오는 함수 .values()
        for (Integer value : intMap.values()) {
            System.out.println(value);
        }
        // 12
        // 11
        // 13
        // 16 // 키가 중복되면 value는 마지막 값으로 덮어씀

        // key를 통해 value를 가져오는 함수 .get("key")
        System.out.println(intMap.get("사")); // 16
    }
}

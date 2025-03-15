package Study.Codinglearn.CodingChap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // (Key, Value) 맵
        HashMap<String, Integer> map = new HashMap<>();

        // 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 16);

        System.out.println(map.size());
        
        // 조회
        System.out.println(map.get("유재석"));  // key
        System.out.println(map.get("박명수"));

        System.out.println("--------------------");

        if(map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println(map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
        }
        System.out.println();

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));  // 없으면 null

        System.out.println("-------------------");

        // 전체 삭제
        map.clear();
        if(map.isEmpty()) {
            System.out.println(map.size());
        }
        System.out.println();


        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 16);

        // 순회 Key
        for(String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        System.out.println("------------------");

        // 순회 Value
        for(int value : map.values()) {
            System.out.println(value);
        }
        System.out.println();
        System.out.println("------------------");

        // 확인 K, V
        for(String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println();


        // 맵 : 중복X, 순서X
        map.put("김종국", 10);
        map.put("김종국", 40);
        map.put("김종국", 30);  // 업데이트 개념이라 30이 출력

        for(String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println();

        // 순서 보장 시 LinkedHashMap<>();
    }
}

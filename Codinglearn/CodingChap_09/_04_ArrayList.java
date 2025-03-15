package Study.Codinglearn.CodingChap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 Collection Framework
        // (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        // 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 조희 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("-----------------");

        // 삭제
        System.out.println(list.size());
        list.remove("박명수");
        System.out.println(list.size());
        System.out.println(list.get(3));

        System.out.println("-----------------");

        System.out.println("남은 수 : " + list.size());
        list.remove(list.size()-1);
        System.out.println(list.size());

        // 순회
        for(String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("-----------------");

        // 변경
        System.out.println(list.get(0));
        list.set(0, "이수근");
        System.out.println(list.get(0));

        System.out.println("-----------------");

        // 확인
        System.out.println(list.indexOf("김종국"));  // int

        if(list.contains("김종국")) {   // true
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("-----------------");

        // 전체 삭제
        list.clear();
        if(list.isEmpty()) {  //
            System.out.println("뭐없음 " + list.size());
        }

        System.out.println("-----------------");

        // 새로운 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 정렬
        Collections.sort(list);

        for(String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();


    }
}

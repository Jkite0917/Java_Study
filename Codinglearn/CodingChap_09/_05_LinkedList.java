package Study.Codinglearn.CodingChap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트

        LinkedList<String> list = new LinkedList<>();

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 조회(인덱스)
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.get(4));
        System.out.println(list.getLast());

        System.out.println("-----------------");

        // 추가
        list.addFirst("첫번째");
        list.add(1, "두번째"); // 추가값을 1로
        System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2) + " ");
        list.addLast("마지막");
        System.out.println(list.get(list.size()-1));

        System.out.println("-----------------");

        // 삭제
        System.out.println(list.size());
        list.remove(list.size()-1);
        System.out.println(list.size());

        System.out.println("-----------------");

        // 처음 끝
        list.removeFirst();
        list.removeLast();

        // 번경
        System.out.println(list.getFirst());
        list.set(0, "이수근");
        System.out.println(list.get(0));

        System.out.println("-----------------");

        // 확인
        System.out.println(list.indexOf("김종국"));
        if(list.contains("김종국")) {
            System.out.println(true);
        }

        // 전체 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println(list.size());
        }
        
        // 정렬
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list);
    }
}

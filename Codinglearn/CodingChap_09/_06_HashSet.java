package Study.Codinglearn.CodingChap_09;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // set
        // list와는 다르게 중복 비허용
        // 순서 보정 안됨

        HashSet<String> set = new HashSet<>();

        // 추가
        set.add("삼겹살");
        set.add("음료");
        set.add("장");
        set.add("채소");
        set.add("삼겹살");

        System.out.println(set.size());

        for(String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 확인
        if(set.contains("삼겹살")) {
            System.out.println("삼겹살");
        }

        System.out.println("-----------------------");

        // 삭제
        System.out.println(set.size());
        set.remove("삼겹살");
        System.out.println(set.size());

        // 전체 삭제
        set.clear();

        if(set.isEmpty()) {
            System.out.println(set.size());
        }

        System.out.println("--------------------------");

        // 세트 Set : 중복 허용 X, 순서 보정 X
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(8);
        intSet.add(7);

        for(int i: intSet) {
            System.out.println(i);
        }

        // 순서 보정을 위한다면 LinkedHashSet<>();

    }
}

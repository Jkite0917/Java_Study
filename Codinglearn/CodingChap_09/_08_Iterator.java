package Study.Codinglearn.CodingChap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();

        list.add("유재석");
        list.add("none");
        list.add("강호동");
        list.add("박명수");
        list.add("none");
        list.add("조세호");

        for(String s : list) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("---------------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("---------------------------");

        it = list.iterator();  // 처음으로 이동
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        System.out.println("------------------");

        it = list.iterator();
        while(it.hasNext()) {
            String s = it.next();
            if(s.contains("none")) {
                it.remove();
            }
        }

        it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        System.out.println("------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");

        Iterator<String> itSet = set.iterator();
        while(itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("----------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 3);

        // map.iterator();
        Iterator<String> itMapKey = map.keySet().iterator();
        while(itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("---------------");

        Iterator<Integer> itMapvalue = map.values().iterator();
        while(itMapvalue.hasNext()) {
            System.out.println(itMapvalue.next());
        }


        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while(itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}

package Study.Codinglearn.CodingChap_09;

import Study.Codinglearn.CodingChap_09.Coffee.*;
import Study.Codinglearn.CodingChap_09.User.User;
import Study.Codinglearn.CodingChap_09.User.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("-----------------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("------------------------------");
        int c3Name = (int) c3.name;
        System.out.println(c3Name);
        String c4Name = (String) c4.name;
        System.out.println(c4Name);

        // c4Name = (String) c3.name;

        System.out.println("-------------------------------");
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println(c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println(c6.name);

        System.out.println("-------------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        System.out.println("---------------------");
        orderCoffee("김영철");
        orderCoffee(36);
        
        orderCoffee("김희철", "라떼");
        orderCoffee(37, "라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("~~~ : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee+ " 나왔습니다. ~~~ : " + name);
    }
}

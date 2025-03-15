package Study.Codinglearn.CodingChap_09.Coffee;

import Study.Codinglearn.CodingChap_09.User.User;

public class CoffeeByUser <T extends User> {
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 나옴 : " + user.name);
        user.addPoint();
    }
}

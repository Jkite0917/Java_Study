package Study.Codinglearn.CodingChap_09.Coffee;

public class CoffeeByNickname {
    public String nickname;

    public CoffeeByNickname(String nickname) {
        this.nickname = nickname;
    }

    public void ready() {
        System.out.println("커피 나옴 : " + nickname);
    }
}

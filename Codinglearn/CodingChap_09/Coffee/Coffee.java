package Study.Codinglearn.CodingChap_09.Coffee;

public class Coffee <T> {
    public T name;

    public Coffee(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 나옴 : " + name);
    }
}

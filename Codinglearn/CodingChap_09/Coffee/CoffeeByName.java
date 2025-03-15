package Study.Codinglearn.CodingChap_09.Coffee;

public class CoffeeByName {
    public Object name;

    public CoffeeByName(Object name){
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 나옴 : " + name);
    }
}

package Study.Codinglearn.CodingChap_09.Coffee;

public class CoffeeByNumber {
    public int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 나옴 : " + waitingNumber);
    }
}

package Study.Codinglearn.CodingChap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        System.out.println(b1.serialNumber);

        BlackBox b2 = new BlackBox
                ("하양이", "UHD", 300000, "화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
    }
}

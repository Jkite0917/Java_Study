package Study.Codinglearn.CodingChap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "Rkakddl";

        b1.record(false, false, 10);
        System.out.println();
        b1.record(true, false, 3);
        System.out.println();
        b1.record(true, true, 5);

        b1.record();

        String s = "BlackBox";
        System.out.println(s.indexOf("a"));
    }
}

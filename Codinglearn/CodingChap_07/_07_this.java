package Study.Codinglearn.CodingChap_07;

public class _07_this {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.appendModelName("(최신형)");  // ctrl + shift + i
        System.out.println(b1.modelName);

    }
}

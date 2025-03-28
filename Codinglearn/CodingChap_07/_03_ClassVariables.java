package Study.Codinglearn.CodingChap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        System.out.println(b1.canAutoReport);
        System.out.println(BlackBox.canAutoReport);  // 권장방식
        BlackBox.canAutoReport = true;

        System.out.println(b2.canAutoReport);
        System.out.println(BlackBox.canAutoReport);
    }
}

package Study.Codinglearn.CodingChap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "h2";

        b1.autoReport();
        BlackBox.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(200);

        int fileCount = b1.getVideoFileCount(1);
        System.out.println(fileCount);
        fileCount = b1.getVideoFileCount(2);
        System.out.println(fileCount);
    }
}

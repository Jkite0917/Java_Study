package Study.Codinglearn.CodingChap_07;

public class _09_Getter_Setter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망";
        // b1.resolution = "FHD";
        b1.price = 200000;
        b1.Color = "블랙";

        //할인 행사
        b1.price = -5000;
        System.out.println(b1.price);

        // 고객 문의
        System.out.println(b1.resolution); // null


        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println(b2.getPrice());
        System.out.println(b2.getResolution());
    }
}

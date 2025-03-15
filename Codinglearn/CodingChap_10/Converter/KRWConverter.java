package Study.Codinglearn.CodingChap_10.Converter;

public class KRWConverter implements Convertable {
    @Override
    public void convert(int USD) {
        // 1 = 1400
        System.out.println(USD + " 달러 = " + (USD*1400) + " 원");
    }
}

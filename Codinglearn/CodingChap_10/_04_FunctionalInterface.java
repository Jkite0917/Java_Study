package Study.Codinglearn.CodingChap_10;

import Study.Codinglearn.CodingChap_10.Converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        // converter.convert(2);

        //convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD*1400) + " 원"), 2);
        Convertable convertable = (USD) -> System.out.println(USD + " 달러 = " + (USD*1400) + " 원");
        convertUSD(convertable, 2);

        // 전달값이 없는 경우
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러 = 1400원");
        c1.convert();

        // 두 줄 이상의 코드
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD*1400) + " 원");
        };
        c1.convert();

        // 전달값 두개
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d+ " 달러 = " + (d*w) + " 원");
        c2.convert(10, 1400);

        // 반환값이 있는 경우
        ConvertibleWithReturn c3 = (d, w) -> d * w;
        int result = c3.convert(4, 1400);
        System.out.println(result);

    }

    public static void convertUSD(Convertable converter, int USD) {
        converter.convert(USD);
    }
}

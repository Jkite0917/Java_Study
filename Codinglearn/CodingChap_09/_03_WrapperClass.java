package Study.Codinglearn.CodingChap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // Wrapper 클래스
        // int dounle float char

        Integer i = 123;
        Double d = 1.0;
        Float f = 4.0F;
        Character c = 'A';

        System.out.println(i + " " + d + " " +  f + " " + c);

        System.out.println("-------------------");

        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println("-------------------");

        String s = i.toString();
        System.out.println(s);
    }
}

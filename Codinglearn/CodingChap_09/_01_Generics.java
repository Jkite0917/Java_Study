package Study.Codinglearn.CodingChap_09;

public class _01_Generics {
    public static void main(String[] args) {
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0};
        String[] sArray = {"A", "B"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println();

        printAnyArray(iArray);
        printAnyArray(dArray);
        // 제네릭은 객체를 지원하기 때문에 int나 double같은건 wrapper로 덮어야함
        /*
        int -> Integer.parseInt();
        String.valueOf();
        double ->Double.toString();
         */
        printAnyArray(sArray);
    }

    // 제네릭스
    // Type, Key, Value, Element
    private static <T> void printAnyArray(T[] array) {
        for(T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for(double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for(String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for(int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}

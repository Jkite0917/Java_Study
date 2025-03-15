package Study.Codinglearn.CodingChap_06;

public class _04_ParameterAndReturn {
//    public static void powerByExp(int A, int B) {
//        int result = 1 ;
//        for(int i=0; i<B; i++) {
//            result *= A;
//        }
//        System.out.println(A+"의 "+B+"승은 "+result+"입니다.");
//    }
    public static int power(int number) {
        return number * number;
    }
    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i=0; i<exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        int retval = power(4);
        System.out.println(retval);

        retval = getPowerByExp(5, 2);
        System.out.println(retval);
    }
}

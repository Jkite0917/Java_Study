package Study.Codinglearn.CodingChap_06;

public class _05_Overloading {
    public static int power(int number) {
        return number * number;
    }
    public static int power(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static int power(int number, int exponent) {
        int result = 1;
        for (int i=0; i<exponent; i++) {
            result *= number;
        }
        return result;
    }

    // 이름이 같은 메소드에서, 파라미터 타입 종류만 다르게 하면 된다.
    // 전달 타입이 다르거나, 개수가 다르거나.

    public static void main(String[] args) {
        int p = power(4);

        System.out.println(power(4));
        System.out.println(power("4"));
        System.out.println(power(4, 3));

        // 메소드 오버로딩
        // 같은 기능을 하는 메소드지만 입력받는
        // 파라미터 값의 타입이 다르거나 개수가 다를 떄,
        // 이름을 같게하고 파라미터 유형이 다른 메소드를 여러개 만든다면
        // 실행할 때 어떤 값을 넣냐에 따라 그에 맞는 메소드로 실행된다.
    }
}

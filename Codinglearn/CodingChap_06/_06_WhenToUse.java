package Study.Codinglearn.CodingChap_06;

import java.util.Scanner;

public class _06_WhenToUse {
    public static void main(String[] args) {
        //메소드가 필요한 이유

//        public static int power(int number, int exponent) {
//            int result = 1;
//            for (int i=0; i<exponent; i++) {
//                result *= number;
//            }
//            return result;
//        }
        // 만약 메소드가 아니라면?
        // 계속 반복해야하겟지>?
        // 코드는 계속 길어지고 난잡해지겟지>? 찾기 힘들겠지?
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int number = sc.nextInt();
            int exponent = sc.nextInt();

            int result = 1;
            for (int i=0; i<exponent; i++) {
                result *= number;
            }
            System.out.println(result);
        }

    }
}

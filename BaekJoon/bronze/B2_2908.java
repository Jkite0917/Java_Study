package Study.BaekJoon.문자열;

import java.util.Scanner;
public class B2_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] change = new String[2];

        for(int i=0; i<2; i++) {
            char[] number = sc.next().toCharArray();
            char tmp = number[0];
            number[0] = number[2];
            number[2] = tmp;
            change[i] = new String(number, 0, number.length);
        }
        sc.close();

        int A = Integer.parseInt(change[0]);
        int B = Integer.parseInt(change[1]);

        System.out.println(Math.max(A, B));
    }
}
// Math.max() = 입력값으로 받은 숫자 중 가장 큰 숫자
// new String(chararrayname, startindex, endindex) = char 배열을 String 문자열로 변환
package Study.BaekJoon.문자열;

import java.util.Scanner;
public class B2_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for(int i=0; i<T; i++) {
            int R = Integer.parseInt(sc.next());
            String S = sc.next();
            char[] result = S.toCharArray();

            for(int j=0; j<result.length; j++) {
                for(int n=0; n<R; n++) {
                    System.out.print(result[j]);
                }
            }
            System.out.println();
        }
    }
}

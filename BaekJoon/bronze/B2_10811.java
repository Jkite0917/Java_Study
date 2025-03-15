package Study.BaekJoon;

import java.util.Scanner;
public class B2_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();
        int[] basket = new int[N];

        for(int i=0; i<N; i++) {
            basket[i] = i+1;
        }

        for(int i=0; i<M; i++) {
            int I = sc.nextInt(); int J = sc.nextInt();
            while(true) {
                if (I >= J) {
                    break;
                }
                int tmp = basket[I-1];
                basket[I-1] = basket[J-1];
                basket[J-1] = tmp;
                I++; J--;
            }
        }
        sc.close();

        for(int i=0; i<N; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}

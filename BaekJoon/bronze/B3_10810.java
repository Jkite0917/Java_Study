package Study.BaekJoon;

import java.util.Scanner;
public class B3_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();

        int[] basket = new int[N];
        for(int i=0; i<M; i++) {
            int I = sc.nextInt(); int J = sc.nextInt();
            int K = sc.nextInt();
            for(int j=I; j<=J; j++){
                basket[j-1] = K;
            }
        }

        for(int i=0; i<N; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}

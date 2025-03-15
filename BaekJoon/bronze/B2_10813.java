package Study.BaekJoon;

import java.util.Scanner;
public class B2_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] basket = new int[N];
        for(int i=0; i<N; i++) {
            basket[i] = i+1;
        }

        int M = sc.nextInt();
        for(int i=0; i<M; i++) {
            int I = sc.nextInt(); int J = sc.nextInt();
            int tmp = basket[I];
            basket[I] = basket[J];
            basket[J] = tmp;
        }
        sc.close();

        for(int i=0; i<N; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}

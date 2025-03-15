package Mojuk_codeTest.Sliver;

import java.util.Scanner;

public class S4_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int top = -1;
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            int number = sc.nextInt();

            if(number == 0) {
                top--;
            }
            else {
                top++;
                arr[top] = number;
            }
        }

        int sum = 0;
        for(int i=0; i<=top; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}

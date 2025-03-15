package Mojuk_codeTest.Bronze;

import java.util.Scanner;

public class B3_2441 {
    public static void main(String args[]) {
        // Bronze3_2441
        // 별 찍기 - 4
        // 첫째 줄 부터 N번째 줄 까지  N..N-1 ... 1 출력

        Scanner Scanner = new Scanner(System.in);
        int Count = Scanner.nextInt();

        for(int i=Count, j=0; i>0; i--, j++) {
            for (int line = 0; line < j; line++)
                System.out.print(" ");

            for (int Stars = 0; Stars < i; Stars++)
                System.out.print("*");

            System.out.println("");
        }
    }
}

/*
for(int i=Count, j=0; i>0; i--, j++) {
            for(int line=0; line<j; line++) {
                System.out.print(" ");
            }

            for(int Stars=0; Stars<i; Stars++) {
                System.out.print("*");
            }
            System.out.println("");
        }
 */
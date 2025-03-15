package Study.BaekJoon.문자열;

import java.util.Scanner;
public class B2_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] as = sc.nextLine().toCharArray();

        int[] time = new int[as.length];
        int result = 0;
        for(int i=0; i<as.length; i++) {
            if (as[i] == 'A' || as[i] =='B' || as[i] == 'C') {
                time[i] = 3;
            } else if(as[i] == 'D' || as[i] =='E' || as[i] == 'F') {
                time[i] = 4;
            } else if(as[i] == 'G' || as[i] =='H' || as[i] == 'I') {
                time[i] = 5;
            } else if(as[i] == 'J' || as[i] =='K' || as[i] == 'L') {
                time[i] = 6;
            } else if(as[i] == 'M' || as[i] =='N' || as[i] == 'O') {
                time[i] = 7;
            } else if(as[i] == 'P' || as[i] =='Q' || as[i] == 'R' || as[i] == 'S') {
                time[i] = 8;
            } else if(as[i] == 'T' || as[i] =='U' || as[i] == 'V') {
                time[i] = 9;
            } else if(as[i] == 'W' || as[i] =='X' || as[i] == 'Y' || as[i] == 'Z') {
                time[i] = 10;
            } else  {
                time[i] = 11;
            }
            result += time[i];
        }
        sc.close();
        System.out.println(result);
    }
}


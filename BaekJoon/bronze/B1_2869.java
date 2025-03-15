package Study.BaekJoon;

import java.util.Scanner;
public class B1_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int day =0;
        if((V - (V/(A-B)-1)*(A-B)) <= A) {
            day = (V/(A-B)-1) + 1;
        } else {
            day = (V/(A-B)-1) + 2;
        }
    }
}

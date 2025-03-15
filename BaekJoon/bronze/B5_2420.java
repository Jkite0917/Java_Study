package Study.BaekJoon;

import java.util.Scanner;
import java.lang.Math;

public class B5_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long result = A - B;
        System.out.println(Math.abs(result));
    }
}

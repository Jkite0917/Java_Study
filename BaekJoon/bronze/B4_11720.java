package Study.BaekJoon.문자열;

import java.util.Scanner;
public class B4_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        String textNum = sc.nextLine();

        int result = 0;
        for(int i=0; i<count; i++) {
            result += Integer.parseInt(textNum.substring(i, i+1));
        }
        System.out.println(result);
    }
}

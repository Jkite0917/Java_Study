package Study.BaekJoon.문자열;

import java.util.Scanner;
public class B2_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        sc.close();

        String[] words = text.split(" ");
        System.out.println(words.length);
    }
}
// trim(), strip() 앞뒤 공백제거 strip이 탭 등 더 많은 공백을 지움

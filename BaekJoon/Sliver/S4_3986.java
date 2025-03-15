package Mojuk_codeTest.Sliver;

import java.util.Scanner;
import java.util.Stack;

public class S4_3986 {
    // 아치형 곡선 문제
    // 그냥 괄호와 계산 방식이 똑같음

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
            oneLine(sc.next());
        }

        System.out.println(count);
    }

    public static void oneLine(String Line) {
        if(Line.length() % 2 == 1) return;

        Stack<Character> stack = new Stack<>();

        stack.push(Line.charAt(0));
        for(int i=1; i<Line.length(); i++) {
            if(stack.size() > 0 && stack.peek() == Line.charAt(i)) {
                stack.pop();
            } else {
                stack.push(Line.charAt(i));
            }
        }

        if(stack.empty()) count ++;

    }
}

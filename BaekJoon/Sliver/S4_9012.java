package Mojuk_codeTest.Sliver;

import java.util.Scanner;
import java.util.Stack;

public class S4_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++) {
            System.out.println(oneLine(sc.next()));
        }
    }

    public static String oneLine(String Line) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i < Line.length(); i++) {
            char c = Line.charAt(i);

            if ( c == '(') {
                stack.push(c);
            }

            else if(stack.empty()) {
                return "NO";
            }

            else {
                stack.pop();
            }
        }

        if(stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}


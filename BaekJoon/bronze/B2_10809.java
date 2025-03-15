package Study.BaekJoon.문자열;

import java.util.Scanner;
public class B2_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String as = sc.nextLine();
        sc.close();

        char[] arr = as.toCharArray();
        int[] arrAsc = new int[arr.length];

        for(int i=0; i<as.length(); i++) {
            arrAsc[i] = arr[i];
        }

        int[] alphabet = new int[26];
        for(int i=0; i<26; i++) {
            alphabet[i] = -1;
        }

        for(int i=0; i<arrAsc.length; i++) {
            if(alphabet[arrAsc[i]-97] == -1) {
                alphabet[arrAsc[i]-97] = i;
            }
        }

        for(int i=0; i<26; i++) {
            System.out.print(alphabet[i]+" ");
        }
    }
}
/*  ChatGPT code
import java.util.Scanner;

public class B2_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String as = sc.nextLine();
        sc.close();

        int[] alphabet = new int[26]; // 알파벳 위치를 저장하는 배열

        for (int i = 0; i < as.length(); i++) {
            char ch = as.charAt(i);
            if (Character.isLowerCase(ch)) { // 소문자만 처리
                int index = ch - 'a'; // 알파벳의 인덱스 계산
                if (alphabet[index] == 0) { // 해당 알파벳이 처음 등장하는 경우
                    alphabet[index] = i + 1; // 인덱스를 저장 (1부터 시작하도록)
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            System.out.print((alphabet[i] == 0 ? -1 : alphabet[i] - 1) + " ");
        }
    }
}

*/
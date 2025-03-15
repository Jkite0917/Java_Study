package Study.BaekJoon.심화;

import java.util.Scanner;
public class S5_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = Integer.parseInt(sc.nextLine());
        int groupWordCount = 0;

        for(int i=0; i<repeat; i++) {
            if(isGroupWord(sc.nextLine())) {
                groupWordCount++;
            }
        }
        System.out.println(groupWordCount);
    }

    private static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];

        for(int i=0; i<word.length(); i++) {
            char currentChar = word.charAt(i);

            if (visited[currentChar - 'a'] && word.charAt(i-1) != currentChar) {
                return false;
            }

            visited[currentChar - 'a'] = true;
        }
        return true;
    }
}

/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int count = 0;
        for(int i=0; i<N; i++) {
            char[] as = sc.nextLine().toCharArray();
            if(as.length == 1) {
                count += 1;
                break;
            }
            int[] alphabet = new int[26];

            for(int j=0; j<as.length; j++) {
                alphabet[as[j] - 'a'] += 1;
            }

            boolean isgroup = true;
            for(int j=0; j<alphabet.length; j++) {
                char a;
                if(alphabet[j] > 1) {
                    a =  (char) (j + 97);
                    for(int n=0; n<as.length; n++) {
                        if(as[n] == a) {
                            for(int m=1; m<alphabet[j]; m++) {
                                if(n+m >= as.length) {
                                    break;
                                }
                                if(as[n+m] != a) {
                                    isgroup = false;
                                }
                                if (!isgroup) {
                                    break;
                                }
                            }
                        }
                        if (isgroup) {
                            count += 1;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
 */

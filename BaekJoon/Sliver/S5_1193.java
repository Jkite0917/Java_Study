package Mojuk_codeTest.Sliver;

import java.util.Scanner;

public class S5_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] info = findLine(number);
        /*
        int[] info = new int[2];
        info[0] = cycle -1;
        info[1] = count;
         */

        int firstNum = 0; int secondNum = 0;

        if(info[0] == 0) {
            // 1 또는 2 == 1/1 or 1/2
            firstNum = 1;
            if(info[1] == 0) {
                secondNum = 2;
            } else {
                secondNum = 1;
            }
        } else if (info[0] % 2 == 0){
            // 뒷자리가 2
            // 앞자리는 info[0] + 1
            if(info[1] > info[0]) {
                firstNum = 1;
                secondNum = info[1];
            } else {
                firstNum = info[0] + 1 - info[1];
                secondNum = 2 + info[1];
            }
        } else {
            // 앞자리가 2
            // 뒷자리는 info[0] + 1
            if(info[1] > info[0]) {
                firstNum = info[1];
                secondNum = 1;
            } else {
                firstNum = 2 + info[1];
                secondNum = info[0] + 1 - info[1];
            }
        }

        System.out.println(firstNum + "/" + secondNum);
    }

    public static int[] findLine(int number) {
        int value = 0;
        int cycle = 0;
        int count = 0;

        while(true) {
            if (value < number) {
                value += (2 + cycle);
                cycle ++;
            } else if (value > number) {
                while(true) {
                    count++;
                    value -= 1;
                    if(value == number) {
                        break;
                    }

                }
                break;
            } else {
                break;
            }
        }

        int[] info = new int[2];
        info[0] = cycle-1;
        info[1] = count;

        return info;
    }
}

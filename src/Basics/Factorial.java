package Basics;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        int efficientNum = num;
        long factorial = 1;
        while (num > 0) {
            factorial *= num;
            num--;
        }
        System.out.println(factorial);
        int trailingZeroCount = 0;
        while (factorial > 0) {
            if (factorial % 10 == 0) {
                trailingZeroCount++;
            } else {
                break;
            }
            factorial /= 10;
        }
        System.out.println(trailingZeroCount);

        //Efficient Way
        int efficientTrailingZero = 0;
        while (efficientNum > 0) {
            efficientTrailingZero += efficientNum/5;
            efficientNum /= 5;
        }
        System.out.println(efficientTrailingZero);
    }
}

package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    static int sum = 0;
    static void revNum(int n) {
        if (n == 0) return;
        int rem = n % 10;
        sum = sum * 10 + rem;
        revNum(n / 10);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any num: ");
        int n = sc.nextInt();
        revNum(n);
        System.out.println(sum);
    }
}

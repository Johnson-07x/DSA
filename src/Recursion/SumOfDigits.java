package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int n) {
        if (n == 0) return n;
        return (n % 10) + sumOfDigits(n / 10);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any num: ");
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }
}

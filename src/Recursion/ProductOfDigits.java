package Recursion;

import java.util.Scanner;

public class ProductOfDigits {
    static int productOfDigits(int n) {
        if (n == 0) return 1;
        return (n % 10) * productOfDigits(n / 10);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any num: ");
        int n = sc.nextInt();
        System.out.println(productOfDigits(n));
    }
}

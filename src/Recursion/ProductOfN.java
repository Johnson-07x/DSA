package Recursion;

import java.util.Scanner;

public class ProductOfN {
    static int product(int n) {
        if (n == 1) return n;
        return n * product(n - 1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any num: ");
        int n = sc.nextInt();
        System.out.println(product(n));
    }
}

package Recursion;

import java.util.Scanner;

public class SumOfN {
    static int sum(int n) {
        if (n == 0) return n;
        return n + sum(n - 1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any num: ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}

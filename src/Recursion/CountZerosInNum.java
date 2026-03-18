package Recursion;

import java.util.Scanner;

public class CountZerosInNum {
    static int c = 0;
    static void count(int n) {
        if (n == 0) return;
        if (n % 10 == 0) c++;
        count(n / 10);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any num: ");
        int n = sc.nextInt();
        count(n);
        System.out.println(c);
    }
}

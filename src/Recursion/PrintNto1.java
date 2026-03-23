package Recursion;

import java.util.Scanner;

public class PrintNto1 {
    static void print(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        print(n - 1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any num: ");
        int n = sc.nextInt();
        print(n);
    }
}

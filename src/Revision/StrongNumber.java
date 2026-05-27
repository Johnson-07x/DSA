package Revision;

import java.util.Scanner;

public class StrongNumber {
    static int findFactorial(int n) {
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

//    static int findFactorial(int n) {
//        return (n <= 1) ? 1 : n * findFactorial(n - 1);
//    }

    static boolean checkStrong(int n) {
        int copy = n;
        int result = 0;
        while (n != 0) {
            int last = n % 10;
            result += findFactorial(last);
            n /= 10;
        }

        return copy == result;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Strong Number: ");
        int n = sc.nextInt();

        boolean result = checkStrong(n);
        System.out.println(result);
    }
}

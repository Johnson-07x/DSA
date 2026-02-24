package Methods;

import java.util.Scanner;

public class RecFactorial {
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
}

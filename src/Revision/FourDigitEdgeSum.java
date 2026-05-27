package Revision;

import java.util.Scanner;

public class FourDigitEdgeSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any 4 digit number: ");
        int n = sc.nextInt();

        int result = 0;
        if (n >= 1000 && n <= 9999) {
            int last = n % 10;
            int first = n / 1000;
            result = first + last;
        } else {
            System.out.println("Not a 4 digit Number");
        }

        System.out.println(result);
    }
}

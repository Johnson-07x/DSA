package Revision;

import java.util.Scanner;

public class FindTrendyNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int n = sc.nextInt();

        if (n >= 100 && n <= 999) {
            // Remove last digit
            n /= 10;
            // Get middle number
            int mid = n % 10;
            // Check it is Trendy
            if (mid % 3 == 0) {
                System.out.println("Trendy");
            } else {
                System.out.println("Not Trendy");
            }
        } else {
            System.out.println("Not a 3 digit number");
        }
    }
}

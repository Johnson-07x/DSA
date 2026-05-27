package Revision;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int n2 = n;

        int rev = 0;
        while (n != 0) {
            int last = n % 10;
            rev = (rev * 10) + last;
            n /= 10;
        }
        System.out.println("Reversed Number: " + rev);

        // Reversing using for loop
        int rev2 = 0;
        for (int i = n2; i > 0;) {
            int last = i % 10;
            rev2 = (rev2 * 10) + last;
            i /= 10;
        }

        System.out.println("Reversed 2nd Number: " + rev2);
    }
}

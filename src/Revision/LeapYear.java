package Revision;

import java.util.Scanner;

public class LeapYear {
    static boolean checkLeapYear(int n) {
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                return (n % 400 == 0);
            }
            return true;
        }

        return false;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Leap Year: ");
        int n = sc.nextInt();

        boolean result = checkLeapYear(n);
        System.out.println(result);
    }
}

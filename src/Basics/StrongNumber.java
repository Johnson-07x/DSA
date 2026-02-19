package Basics;

import java.util.Scanner;

public class StrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        int copy = num;
        int sum = 0;
        while (num > 0) {
            int lastNum = num % 10;

            int fact = 1;
            while (lastNum > 0) {
                fact *= lastNum;
                lastNum--;
            }
            sum += fact;
            num /= 10;
        }
        System.out.println(sum);
        if (copy == sum) {
            System.out.print(copy + " is a valid strong Number");
        } else {
            System.out.print(copy + " is not a Strong Number");
        }
    }
}

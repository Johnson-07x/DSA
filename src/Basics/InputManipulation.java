package Basics;

import java.util.Scanner;

public class InputManipulation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println(num1);
        System.out.println(name);
    }
}

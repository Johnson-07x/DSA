package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nums to print: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            int third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
        }

        System.out.println();
        int[] arr = new int[n];
        arr[1] = 1;
        first = 0;
        second = 1;
        for (int i = 2; i <n; i++) {
            int third = first + second;
            arr[i] = third;
            first = second;
            second = third;
        }
        System.out.println(Arrays.toString(arr));
    }
}

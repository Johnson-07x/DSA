package Basics;

import java.util.Scanner;

public class Array_2D {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row Size: ");
        int row = sc.nextInt();
        System.out.print("Enter Column Size: ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

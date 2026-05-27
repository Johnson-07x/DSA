package Revision;

public class RightAngleTriangle {
    static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        int rows = 5; // You can change this value to increase/decrease pyramid size

        // Outer loop handles the number of rows
        for (int i = 1; i <= rows; i++) {

            // First inner loop prints the leading spaces for centering
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Second inner loop prints the odd number of stars per row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Moves the cursor to the next line after completing each row
            System.out.println();
        }
    }
}

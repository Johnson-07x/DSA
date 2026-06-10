package Kunal.Pattern;

public class StartingEndingTriangle {
    static public void printLongStartEndTriangle(int n) {
        for (int i = 1; i <= n * 2 - 1; i++) {
            int totalStarsInRow = i > n ? (2 * n - i) : i;
            for (int j = 1; j <= totalStarsInRow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printLongStartEndTriangle(n);
    }
}

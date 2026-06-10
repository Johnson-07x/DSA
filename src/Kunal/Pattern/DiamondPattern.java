package Kunal.Pattern;

public class DiamondPattern {
    static public void printDiamond(int n) {
        for (int i = 1; i <= n * 2 - 1; i++) {
            int colCount = (i > n) ? 2 * n - i : i;
            int gaps = n - colCount;
            for (int j = 0; j < gaps; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= colCount; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printDiamond(n);
    }
}

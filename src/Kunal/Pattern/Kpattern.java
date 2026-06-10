package Kunal.Pattern;

public class Kpattern {
    static public void printKpattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int rowsToPrint = (i > n) ? i - n + 1 : n - i + 1;
            for (int j = 1; j <= rowsToPrint; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printKpattern(n);
    }
}

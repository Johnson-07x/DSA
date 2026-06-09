package Revision.PrevYrLuvAndAll;

public class PrimeNumber {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i+=2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    static public void printAllPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static void main(String[] args) {
        int n = 17;
        printAllPrimes(n);
    }
}

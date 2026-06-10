package Revision.PrevYrLuvAndAll;

import java.util.Arrays;

public class PrimeNumber {
    static public void printAllPrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    static void main(String[] args) {
        int n = 150;
        printAllPrimes(n);
    }
}

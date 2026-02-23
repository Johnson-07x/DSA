package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] sieve = new boolean[n + 1];
        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sieve[i]) {
                count++;
            }
        }
        System.out.println(count);

    }
}

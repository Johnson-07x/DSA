package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        int subsetNum = 1 << n;
        System.out.println(subsetNum);
        boolean[] sieve = new boolean[n + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

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
        return count;
    }
}

public class CountPrimes {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        Solution s = new Solution();
        System.out.println(s.countPrimes(num));
    }
}

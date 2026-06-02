package Revision.LavendalOldQuest;

import java.util.Set;
import java.util.TreeSet;

public class DiffInPrimes {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i+=2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    static int findDiff(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        TreeSet<Integer> s = new TreeSet<>();

        for (int n : arr) {
            if (isPrime(n)) {
                s.add(n);
            }
        }

        if (s.size() <= 1) return 0;

        return Math.abs(s.getFirst() - s.getLast());
    }

    static void main(String[] args) {
        int[] arr = {4,4,4};
        int result = findDiff(arr);
        System.out.println(result);
    }
}

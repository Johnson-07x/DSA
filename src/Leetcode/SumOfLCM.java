package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfLCM {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i+=2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    static int findSumOfLCM(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                while (n % i == 0) {
                    list.add(i);
                    n /= i;
                }
            }
        }

        if (n > 1) list.add(n);
        System.out.println(list);

        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

    static void main(String[] args) {
        int n = 60;

        int result = findSumOfLCM(n);
        System.out.println(result);
    }
}

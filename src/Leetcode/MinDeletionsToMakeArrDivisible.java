package Leetcode;

// Leetcode no. 2344

import java.util.Arrays;

class Solution9 {
    static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int gcd = numsDivide[0];
        for (int i = 1; i < numsDivide.length; i++) {
            gcd = findGCD(gcd, numsDivide[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (gcd % nums[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}

public class MinDeletionsToMakeArrDivisible {
    static void main(String[] args) {
        int[] nums = {2,3,2,4,3};
        int[] numsDivide = {9,6,9,3,15};
        Solution9 s9 = new Solution9();
        System.out.println(s9.minOperations(nums, numsDivide));
    }
}

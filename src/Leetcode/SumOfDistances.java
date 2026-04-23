package Leetcode;

import java.util.Arrays;

// Leetcode no.2615
public class SumOfDistances {
    static public long[] distance(int[] nums) {
        int n = nums.length;
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    sum += Math.abs(i - j);
                }
            }
            result[i] = sum;
        }

        return result;
    }

    static void main(String[] args) {
        int[] nums = {1,3,1,1,2};
        long[] result = distance(nums);
        System.out.println(Arrays.toString(result));
    }
}

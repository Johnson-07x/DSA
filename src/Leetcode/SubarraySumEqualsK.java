package Leetcode;

import java.util.HashMap;

// Leetcode no.560
public class SubarraySumEqualsK {
    static public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        // Map stores: <PrefixSum, Frequency>
        HashMap<Integer, Integer> map = new HashMap<>();

        // Base case: a sum of 0 has been seen once (empty subarray)
        map.put(0, 1);

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) exists in the map, it means
            // there is a subarray that sums to k
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            // Update the frequency of the current prefix sum
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }

    static void main(String[] args) {
        int[] arr = {1,1,1};
        int result = subarraySum(arr, 2);
        System.out.println(result);
    }
}

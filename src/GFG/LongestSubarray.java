package GFG;

// User function Template for Java

import java.util.HashMap;
import java.util.Map;

class Solution6 {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        map.put(0, -1); // VERY IMPORTANT line

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            map.putIfAbsent(sum, i);
        }

        return maxLen;
    }
}


public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {22, 41, 43, 1, 2, 3, 4, 5, 213, 13, 1};
        int k = 15;
        Solution6 s6 = new Solution6();
        System.out.println(s6.longestSubarray(arr, k));
    }
}

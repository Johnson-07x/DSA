package Leetcode;


import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    static public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int absolute = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                absolute = index - i;
                if (Math.abs(absolute) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    static void main(String[] args) {
        int[] arr ={1,2};
        int k = 2;
        System.out.println(containsNearbyDuplicate(arr, k));
    }
}

package Leetcode;

import java.util.HashMap;
import java.util.Map;

// Leetcode no.217
public class ContainsDuplicate {
//    static public boolean containsDuplicate(int[] nums) {
//        Set<Integer> s = new HashSet<>();
//        for (int e : nums) {
//            if (s.contains(e)) {
//                return true;
//            } else {
//                s.add(e);
//            }
//        }
//        return false;
//    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                return true;
            } else {
                m.put(nums[i], i);
            }
        }
        return false;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}

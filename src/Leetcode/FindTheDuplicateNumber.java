package Leetcode;

import java.util.HashSet;
import java.util.Set;

// Leetcode no.287
public class FindTheDuplicateNumber {
    static public int findDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            if (s.contains(n)) return n;
            else s.add(n);
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int result = findDuplicate(arr);
        System.out.println(result);
    }
}

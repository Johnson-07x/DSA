package Leetcode;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Leetcode no.349
public class IntersectionOfTwoArrays {
    static public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int e : nums1) {
            s1.add(e);
        }

        Set<Integer> result = new HashSet<>();
        for (int e : nums2) {
            if (s1.contains(e)) {
                result.add(e);
            }
        }

        int[] res = new int[result.size()];
        int index = 0;
        for (int e : result) {
            res[index] = e;
            index++;
        }
        return res;
    }

    static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}

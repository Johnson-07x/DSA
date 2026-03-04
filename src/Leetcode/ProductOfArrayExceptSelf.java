package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;

// to be continued
public class ProductOfArrayExceptSelf {
    static public int[] productExceptSelf(int[] nums) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int e : nums) {
            l.add(e);
        }

        for (int i = 0; i < l.size(); i++) {

        }

        return new int[] {};
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = productExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }
}

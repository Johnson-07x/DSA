package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Leetcode no.238
public class ProductOfArrayExceptSelf {
    static public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        List<Integer> leftProd = new ArrayList<>();
        List<Integer> rightProd = new ArrayList<>();
        int leftStart = 1;
        int rightStart = 1;
        for (int i = 0; i < length; i++) {
            leftStart *= nums[i];
            leftProd.add(leftStart);
        }

        for (int i = length - 1; i >= 0; i--) {
            rightStart *= nums[i];
            rightProd.addFirst(rightStart);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                result.add(i, rightProd.get(i + 1));
                continue;
            }
            if (i == length - 1) {
                result.add(i, leftProd.get(i - 1));
                continue;
            }
            result.add(leftProd.get(i - 1) * rightProd.get(i + 1));
        }

        int[] resultArr = new int[length];
        for (int i = 0; i < length; i++) {
            resultArr[i] = result.get(i);
        }

        return resultArr;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        int[] result = productExceptSelf(arr);
//        System.out.println(Arrays.toString(result));
        productExceptSelf(arr);
    }
}

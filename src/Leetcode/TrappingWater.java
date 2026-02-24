package Leetcode;

public class TrappingWater {
    static int waterCount(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        int water = 0;
        for (int i = 0; i < n; i++) {
            int min = Math.min(left[i], right[i]);
            water = water + min - height[i];
        }
        return water;
    }

    static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(waterCount(height));
    }
}

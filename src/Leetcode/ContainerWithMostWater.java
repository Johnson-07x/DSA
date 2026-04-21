package Leetcode;

// Leetcode no.11
public class ContainerWithMostWater {
    static public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;
        while (left < right) {
            int width = right - left;
            int water = Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, width * water);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println(result);
    }
}

package Leetcode;

import java.util.Stack;

// Leetcode no.84
public class LargestRectangleInHistogram {
    static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];

                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

    static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        int result = largestRectangleArea(height);
        System.out.println(result);
    }
}

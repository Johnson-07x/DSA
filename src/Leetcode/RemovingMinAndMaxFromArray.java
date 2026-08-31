package Leetcode;

// Leetcode no.2091
public class RemovingMinAndMaxFromArray {
    static public int minimumDeletions(int[] nums) {
        int minIdx = 0, maxIdx = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
            if (nums[i] < min){
                min = nums[i];
                minIdx = i;
            }
        }
        int rightMost = 0, leftMost = 0;
        if (minIdx < maxIdx) {
            leftMost = minIdx;
            rightMost = maxIdx;
        } else {
            leftMost = maxIdx;
            rightMost = minIdx;
        }

        int leftRemoval = rightMost + 1;
        int rightRemoval = n - leftMost;
        int bothRemoval = (leftMost + 1) + (n - rightMost);

        return Math.min(leftRemoval, Math.min(rightRemoval, bothRemoval));
    }

    public static void main(String[] args) {
        int[] arr = {2,10,7,5,4,1,8,6};
        int result = minimumDeletions(arr);
        System.out.println(result);
    }
}

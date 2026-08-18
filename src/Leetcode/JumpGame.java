package Leetcode;

public class JumpGame {
    static public boolean canJump(int[] nums) {
        int far = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > far) return false;
            far = Math.max(far, i + nums[i]);
            if (far >= nums.length - 1) return true;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        boolean result = canJump(arr);
        System.out.println(result);
    }
}

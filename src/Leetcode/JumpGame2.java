package Leetcode;

// Leetcode no.45
public class JumpGame2 {
    public static int jump(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;

        int jumps = 0, currentEnd = 0, far = 0;

        for (int i = 0; i < n; i++) {
            far = Math.max(far, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = far;

                if (far >= n - 1) break;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] jumps = {2,3,1,1,4};
        int result = jump(jumps);
        System.out.println(result);
    }
}

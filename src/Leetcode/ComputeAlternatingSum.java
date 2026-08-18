package Leetcode;

public class ComputeAlternatingSum {
    static public int alternatingSum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) result += nums[i];
            else result -= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int result = alternatingSum(arr);
        System.out.println(result);
    }
}

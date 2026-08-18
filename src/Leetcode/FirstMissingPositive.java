package Leetcode;

public class FirstMissingPositive {
    static public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n + 1];
        for (int num : nums) {
            if (num > 0 && num <= n) arr[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!arr[i]) return i;
        }

        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0};
        int result = firstMissingPositive(arr);
        System.out.println(result);
    }
}

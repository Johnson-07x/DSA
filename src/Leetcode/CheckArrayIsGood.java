package Leetcode;

class Solution1 {
    public boolean isGoodArray(int[] nums) {
        int gcdValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            gcdValue = gcd(gcdValue, nums[i]);
            if (gcdValue == 1) {
                return true;
            }
        }
        return gcdValue == 1;
    }

    public int gcd (int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

public class CheckArrayIsGood {
    static void main(String[] args) {
        int[] arr = {3, 7};
        Solution1 s1 = new Solution1();
        System.out.println(s1.isGoodArray(arr));
    }
}

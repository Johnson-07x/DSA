package LavendelFinalReharsal;

public class MaximumProductSubarray {
    static public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            if (current < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(current, max * current);
            min = Math.min(current, min * current);
            result = Math.max(max, result);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int result = maxProduct(arr);
        System.out.println(result);
    }
}

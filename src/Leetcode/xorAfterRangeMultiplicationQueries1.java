package Leetcode;

// Leetcode no.3653
public class xorAfterRangeMultiplicationQueries1 {
    static public int xorAfterQueries(int[] nums, int[][] queries) {
        for (int[] query : queries) {
            int idx = query[0];
            while (idx <= query[1]) {
                // in cases if we are multiplying the number that is beyond the int value, we need to convert them to long and in final we can regenerate them to (int)
                nums[idx] = (int) (((long) nums[idx] * query[3]) % (Math.pow(10, 9) + 7));
                idx += query[2];
            }
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }

    static void main(String[] args) {
        int[] nums = {2, 3, 1, 5, 4};
        int[][] queries = {{1, 4, 2, 3}, {0, 2, 1, 2}};
        int result = xorAfterQueries(nums, queries);
        System.out.println(result);
    }
}

package Leetcode;

public class StoneGame5 {
    public static int process(int[] arr, int start, int end, int sum) {
        if (start == end) return sum;
        int mid = start + (end - start) / 2;
        int max = 0;

        for (int i = 0; i < end; i++) {
            int lSum = 0;
            int rSum = 0;
            for (int j = start; j <= mid; j++) {
                lSum += arr[j];
            }
            for (int j = mid + 1; j <= end; j++) {
                rSum += arr[j];
            }

            int currChoice = 0;
        }
        return max;
    }

    static public int stoneGameV(int[] stoneValue) {
        return process(stoneValue, 0, stoneValue.length - 1, 0);
    }

    public static void main(String[] args) {
        int[] arr = {6,2,3,4,5,5};
        int result = stoneGameV(arr);
        System.out.println(result);
    }
}

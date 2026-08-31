package Leetcode;

public class StoneGame5 {
    public static int process(int[] arr, int start, int end) {
        if (start == end) return 0;
        int max = 0;

        for (int i = start; i < end; i++) {
            int lSum = 0;
            int rSum = 0;
            for (int j = start; j <= i; j++) {
                lSum += arr[j];
            }
            for (int j = i + 1; j <= end; j++) {
                rSum += arr[j];
            }

            int currChoice = 0;
            if (lSum < rSum) {
                currChoice = lSum + process(arr, start, i);
            } else if (lSum > rSum) {
                currChoice = rSum + process(arr, i + 1, end);
            } else {
                currChoice = lSum + Math.max(process(arr, start, i), process(arr, i + 1, end));
            }

            max = Math.max(max, currChoice);
        }
        return max;
    }

    static public int stoneGameV(int[] stoneValue) {
        return process(stoneValue, 0, stoneValue.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {6,2,3,4,5,5};
        int result = stoneGameV(arr);
        System.out.println(result);
    }
}

package SlidingWindow;

public class LongestSubArrayWithGivenSum {
    static int LongestSubArrayWithSum(int[] arr, int k) {
        int start = 0;
        int currentSum = 0;
        int maxLength = 0;

        for (int end = 0; end < arr.length; end++) {

            currentSum += arr[end];

            while (currentSum > k && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }
        return maxLength;
    }

    static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1, 3, 2};
        int k = 4;
        System.out.println(LongestSubArrayWithSum(arr, k));
    }
}

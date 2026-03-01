package SlidingWindow;

public class LongestSubArrayWithSumLessOrEquals {
    // Efficient Method
    static int findLongestSubArrayWithLessOrEqualsSum(int[] arr, int k) {
        int start = 0;
        int maxLength = 0;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > k) {
                currentSum -= arr[start];
                start++;
            }

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
            }
        }
        return maxLength;
    }

    // BruteForce Method
    static int findLongestSubArray(int[] arr, int k) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                count++;
                sum += arr[j];
                if (sum <= k) {
                    maxLength = Math.max(count, maxLength);
                } else {
                    continue;
                }
            }
        }
        return maxLength;
    }

    static void main(String[] args) {
        int[] arr = {2,1,5,1,3};
        int k = 7;
        System.out.println(findLongestSubArray(arr, k));
        System.out.println(findLongestSubArrayWithLessOrEqualsSum(arr, k));
    }
}

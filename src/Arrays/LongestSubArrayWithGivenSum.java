package Arrays;

public class LongestSubArrayWithGivenSum {
//    static void find(int[] arr, int k) {
//        int maxLength = 0;
//        int sum = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            sum += arr[i];
//            if (sum <= k) {
//
//            }
//        }
//    }

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
    }
}

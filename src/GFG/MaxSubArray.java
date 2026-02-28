package GFG;

class Solution7 {
    public int currentWindowSubarraySum(int[] arr, int k) {
        // Code here
        int length = arr.length;
        int currentWindow = 0;
        for (int i = 0; i < k; i++) {
            currentWindow += arr[i];
        }
        int maxWindow = currentWindow;
        
//        for (int i = 0; i < length; i++) {
//            currentWindow += arr[i];
//            if (i >= k - 1) {
//                maxWindow = Math.max(currentWindow, maxWindow);
//                currentWindow -= arr[i - k + 1];
//            }
//        }

        for (int i = k; i < length; i++) {
            currentWindow = (currentWindow + arr[i]) - arr[i - k];
            maxWindow = Math.max(currentWindow,maxWindow);
        }
        return maxWindow;
    }
}

public class MaxSubArray {
    static void main(String[] args) {
        Solution7 s7 = new Solution7();
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(s7.currentWindowSubarraySum(arr, k));
    }
}

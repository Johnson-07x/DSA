package Leetcode;

// Leetcode no.852
class Solution14 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            int midVal = arr[mid];
            if (midVal < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

public class PeakIndexInMountainArray {
    static void main(String[] args) {
        int[] arr = {0,10,5,2};
        Solution14 s14 = new Solution14();
        int result = s14.peakIndexInMountainArray(arr);
        System.out.println(result);
    }
}

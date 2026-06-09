package Revision.PrevYrLuvAndAll;

public class ContigiousSubArray {
    static public int maxSum(int[] arr) {
        int max = arr[0];
        int curr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);

            max = Math.max(max, curr);
        }

        return max;
    }

    static void main(String[] args) {
        int[] arr = {1,-2,0,8};
        int result = maxSum(arr);
        System.out.println(result);
    }
}

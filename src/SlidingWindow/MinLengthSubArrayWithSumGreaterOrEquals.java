package SlidingWindow;

public class MinLengthSubArrayWithSumGreaterOrEquals {
    static int findTheMinLength(int[] arr, int target) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum >= target) {
                min = Math.min(min, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

    static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(findTheMinLength(arr, target));
    }
}

package SlidingWindow;

public class MaxProductSubArray {
    static void main(String[] args) {
        int[] arr = {1,2,3,-1,0,4};

        int grandMax = arr[0] , max = arr[0] , min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], max * arr[i]);

            grandMax = Math.max(max, grandMax);
        }
        System.out.println(grandMax);
    }
}

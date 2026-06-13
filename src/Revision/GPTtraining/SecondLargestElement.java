package Revision.GPTtraining;

public class SecondLargestElement {
    public static int secondLargest(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 20, 8, 15};
        int result = secondLargest(arr);
        System.out.println(result);
    }
}

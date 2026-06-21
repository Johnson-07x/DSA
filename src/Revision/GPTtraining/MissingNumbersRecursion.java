package Revision.GPTtraining;

public class MissingNumbersRecursion {
    public static int recursion(int[] arr, int index, int sum) {
        if (index == arr.length) return sum;

        return recursion(arr, index + 1, sum - arr[index]);
    }

    public static int findMissing(int[] arr) {
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        return recursion(arr, 0, sum);
    }

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int missing = findMissing(arr);
        System.out.println(missing);
    }
}

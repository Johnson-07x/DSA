package Revision;

public class CheckArrayIsSortedUsingRecursion {
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;

        if (arr[index] > arr[index + 1]) return false;

        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,7,9,10, 12,11};
        boolean result = isSorted(arr, 0);
        System.out.println(result);
    }
}

package Basics;

public class BinarySearch {
    static int binarySearch(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                return binarySearch(arr, target, left, mid - 1);
            }
            return binarySearch(arr, target, mid + 1, right);
        }

        return -1;
    }

    static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 10, 12, 15};
        int target = 7;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(result);
    }
}

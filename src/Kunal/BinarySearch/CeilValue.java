package Kunal.BinarySearch;

// Ceil in binary search is nothing but finding the smallest element that is greater than the target
public class CeilValue {
    static int findCeil(int[] arr, int target) {

        // Base case to check impossible situations
        if (target > arr[arr.length - 1]) return -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static void main(String[] args) {
        int[] numbers = {2, 3, 5, 9, 14, 16, 18};
        int target = 13;
        int position = findCeil(numbers, target);
        System.out.println(position);
    }
}

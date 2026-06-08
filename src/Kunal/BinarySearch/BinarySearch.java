package Kunal.BinarySearch;

public class BinarySearch {
    static int search(int[] arr, int target) {
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

        return -1;
    }

    static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,9,23};
        int target = 9;
        int position = search(arr, target);
        System.out.println(position);
    }
}

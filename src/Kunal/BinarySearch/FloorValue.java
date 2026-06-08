package Kunal.BinarySearch;

// The Floor is the greatest number less than or equal to the target number
public class FloorValue {
    static public int findFloor(int[] arr, int target) {

        // Base case to check
        if (target < arr[0]) return -1;

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

        return end;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 9, 14, 16, 18};
        int target = 13;
        int position = findFloor(numbers, target);
        System.out.println(position);
    }
}

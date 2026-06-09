package Kunal.BinarySearch;

public class InfiniteArraySearch {

    public static void main(String[] args) {
        // A standard array used for demonstration purposes to simulate an infinite array
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 200, 230, 250, 500};
        int target = 10;

        int position = findPositionInInfiniteArray(arr, target);
        System.out.println("Element found at index: " + position);
    }

    // Step 1: Find the bounds for the binary search
    public static int findPositionInInfiniteArray(int[] arr, int target) {
        // Start with a small window of size 2
        int start = 0;
        int end = 1;

        // Keep doubling the window size as long as the target is greater than the end element
        while (target > arr[end]) {
            int newStart = end + 1;
            // Double the size of the previous chunk: newEnd = oldEnd + (size of previous chunk * 2)
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        // Step 2: Apply binary search within the locked-in range [start, end]
        return binarySearch(arr, target, start, end);
    }

    // Standard Binary Search implementation
    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // Prevents potential integer overflow compared to (start + end) / 2
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }
        return -1; // Target does not exist in the array
    }
}

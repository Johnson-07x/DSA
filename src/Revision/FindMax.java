package Revision;

// Finding the Max element in array using Recursion
public class FindMax {
    static int findMax(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int max = findMax(arr, idx + 1);

        return Math.max(max, arr[idx]);
    }

    static void main(String[] args) {
        int[] arr = {6,2,7,2,63,11,43};
        System.out.println(findMax(arr, 0));
    }
}

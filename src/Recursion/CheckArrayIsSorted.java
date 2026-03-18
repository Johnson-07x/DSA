package Recursion;

public class CheckArrayIsSorted {
    static boolean checkSorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        return arr[index] <= arr[index + 1] && checkSorted(arr, index + 1);
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        int target = 4;
        System.out.println(checkSorted(arr, 0));
    }
}

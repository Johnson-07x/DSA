package Recursion;

public class LinearSearch {
    static int linearSearch(int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        return linearSearch(arr, target, index + 1);
    }

    static void main(String[] args) {
        int[] arr = {1,2,4,1,5,6,3};
        int target = 3;
        System.out.println(linearSearch(arr, target, 0));
    }
}

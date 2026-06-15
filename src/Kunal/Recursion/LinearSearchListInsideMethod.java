package Kunal.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchListInsideMethod {
    public static List<Integer> findOccurrences(int[] arr, int target, int index) {
        List<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        List<Integer> result = findOccurrences(arr, target, index + 1);

        list.addAll(result);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,4,6,7};
        List<Integer> result = findOccurrences(arr, 4, 0);
        System.out.println(result);
    }
}

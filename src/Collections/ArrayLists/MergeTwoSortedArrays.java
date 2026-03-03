package Collections.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {
    static List<Integer> mergeSortedArrays(int[] arr1, int[] arr2) {
        int arr1Index = 0;
        int arr2Index = 0;
        List<Integer> result = new ArrayList<>();
        while (arr1Index < arr1.length && arr2Index < arr2.length){
            if (arr1[arr1Index] <= arr2[arr2Index]) {
                result.add(arr1[arr1Index]);
                arr1Index++;
            } else {
                result.add(arr2[arr2Index]);
                arr2Index++;
            }
        }

        if (arr1Index < arr1.length) {
            for (int i = arr1Index; i < arr1.length; i++) {
                result.add(arr1[arr1Index]);
                arr1Index++;
            }
        }
        if (arr2Index < arr2.length) {
            for (int i = arr2Index; i < arr2.length; i++) {
                result.add(arr2[arr2Index]);
                arr2Index++;
            }
        }
        return result;
    }

    static void main(String[] args) {
        int[] arr1 = {1,2,4,5,7,8};
        int[] arr2 = {1,3,4};
        System.out.println(mergeSortedArrays(arr1, arr2));
    }
}

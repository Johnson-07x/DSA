package Sorting;

import java.util.*;


public class ThreeBasicMethodsForSorting {
    static void sortArr(int[] arr, ArrayList<Integer> al) {
        // Arrays.sort()
        Arrays.sort(arr);

        // Collections
        Collections.sort(al);

        // Comparator
        al.sort((a,b) -> (a % 10) - (b % 10));
        System.out.println(Arrays.toString(arr));
    }

    static void main(String[] args) {
        int[] arr = {21,74,75,16,18,33,72,90};
        ArrayList<Integer> al = new ArrayList<>();
        sortArr(arr, al);
    }
}

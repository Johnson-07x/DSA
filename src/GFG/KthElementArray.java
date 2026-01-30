package GFG;

import java.util.*;

class Solution5 {
    public int kthElement(int a[], int b[], int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int e : a) {
            arr.add(e);
        }
        for (int e : b) {
            arr.add(e);
        }
        Collections.sort(arr);
        int element = arr.get(k - 1);
        return element;
    }
}

public class KthElementArray {
    static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b ={1, 4, 8, 10};
        int k = 5;
        Solution5 s5 = new Solution5();
        System.out.println(s5.kthElement(a, b, k));
    }
}

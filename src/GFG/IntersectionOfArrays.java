package GFG;

import java.util.HashSet;

class Solution4 {
    public int intersectSize(int a[], int b[]) {
        int size = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int e : a) {
            set.add(e);
        }
        for (int e : b) {
            if (set.contains(e)) {
                size++;
            }
        }
        return size;
    }
}

public class IntersectionOfArrays {
    static void main(String[] args) {
        int[] a = {89, 24, 75, 11, 23};
        int[] b = {89, 2, 4};
        Solution4 s4 = new Solution4();
        System.out.println(s4.intersectSize(a, b));
    }
}

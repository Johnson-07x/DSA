package GFG;

import java.util.ArrayList;
import java.util.HashSet;

class Solution3 {
    public ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code
        HashSet<Integer> hash = new HashSet<>();
        for (int e : a) {
            hash.add(e);
        }
        for (int e : b) {
            hash.add(e);
        }
        ArrayList<Integer> arr = new ArrayList<>(hash);
        return arr;
    }
}

public class UnionArray {
    static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};
        Solution3 s3 = new Solution3();
        System.out.println(s3.findUnion(a, b));
    }
}

package Revision.Collections;

import java.util.HashSet;

public class HashSetFindMissingNumbersInRange {
    static void main(String[] args) {
        int[] arr = {4,2,1,5,6,9,6,4};
        HashSet<Integer> h = new HashSet<>();
        int max = 0;
        for (int e : arr) {
            if (e > max) max = e;
            h.add(e);
        }

        for (int i = 0; i < max; i++) {
            if (!h.contains(i)) System.out.print(i + " ");
        }
    }
}

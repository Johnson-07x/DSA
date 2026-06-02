package Revision.Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNums {
    static void main(String[] args) {
        Set<Integer> s = new HashSet<>(Arrays.asList(4,1,15,6,3,7,6));
        int max = 0;
        for (Integer n : s) {
            if (n > max) max = n;
        }

        System.out.print("Missing Nums: ");
        for (int i = 0; i < max; i++) {
            if (!s.contains(i)) System.out.print(i + " ");
        }
    }
}

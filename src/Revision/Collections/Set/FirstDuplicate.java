package Revision.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    static void main(String[] args) {
        int[] arr = {2, 5, 1, 2, 3, 5, 1, 2, 4};

        Set<Integer> s = new HashSet<>();

        for (int n : arr) {
            if (s.contains(n)) {
                System.out.println(n);
                break;
            } else {
                s.add(n);
            }
        }
    }
}

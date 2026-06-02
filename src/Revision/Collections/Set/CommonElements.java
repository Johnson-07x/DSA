package Revision.Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,5,2,7,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(5,2,9,4,0));

        for (Integer n : s2) {
            if (s1.contains(n)) System.out.println(n);
        }
    }
}

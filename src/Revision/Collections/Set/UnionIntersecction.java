package Revision.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersecction {
    static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4));
        // Create Set 2
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5, 6));

        // 1. Find Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union); // Output: [1, 2, 3, 4, 5, 6]

        // 2. Find Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection); // Output: [3, 4]
    }
}

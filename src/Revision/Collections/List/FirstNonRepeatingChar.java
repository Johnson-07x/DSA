package Revision.Collections.List;

import java.util.*;

public class FirstNonRepeatingChar {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,4,6,3,1,2));
        Map<Integer, Integer> m = new HashMap<>();

        for (Integer n : list) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }

        for (Integer n : list) {
            if (m.get(n) == 1) {
                System.out.println(n);
                break;
            }
        }
    }
}

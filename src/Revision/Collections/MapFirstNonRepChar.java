package Revision.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapFirstNonRepChar {
    static void main(String[] args) {
        String s = "Johnson";
        Map<Character, Integer> m = new HashMap<>();

        for (char c : s.toCharArray()) {
            m.put(c , m.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (char c : s.toCharArray()) {
            if (m.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}

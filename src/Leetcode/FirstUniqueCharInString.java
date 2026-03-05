package Leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

// Leetcode no.387
public class FirstUniqueCharInString {
    static public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        char nonRepeating = 0;
        for (Map.Entry <Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                nonRepeating = entry.getKey();
                break;
            }
        }
        if (nonRepeating == 0) {
            return -1;
        }

        return s.indexOf(nonRepeating);
    }

    static void main(String[] args) {
        String s = "dddccdbba";
        System.out.println(firstUniqChar(s));
    }
}

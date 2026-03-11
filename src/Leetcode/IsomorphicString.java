package Leetcode;

import java.util.HashMap;
import java.util.Map;

// Leetcode no.205
public class IsomorphicString {
    static public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);
            if (map.containsKey(s1)) {
                if (map.get(s1) != s2) return false;
            } else {
                if (map.containsValue(s2)) return false;
                map.put(s1, s2);
            }
        }

        return true;
    }

    static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        boolean result = isIsomorphic(s1, s2);
        System.out.println(result);
    }
}

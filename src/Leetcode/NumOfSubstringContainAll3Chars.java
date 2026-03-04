package Leetcode;

import java.util.HashMap;
import java.util.Map;

// Leetcode no.1358
public class NumOfSubstringContainAll3Chars {
    static public int numberOfSubstrings(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
            if (map.containsKey('a') && map.containsKey('b') && map.containsKey('c')) {
                count += Math.min(map.get('a'), Math.min(map.get('b'), map.get('c'))) + 1;
            }
        }

        return count;
    }

    static void main(String[] args) {
        String s = "abcabc";
        int result = numberOfSubstrings(s);
        System.out.println(result);
    }
}

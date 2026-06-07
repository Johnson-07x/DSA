package Leetcode;

import java.util.HashMap;
import java.util.Map;

// Leetcode no.383
public class RansomeNote {
    static public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ran = new HashMap<>();
        Map<Character, Integer> mag = new HashMap<>();

        for (char ch : ransomNote.toCharArray()) {
            ran.put(ch, ran.getOrDefault(ch, 0) + 1);
        }

        for (char ch : magazine.toCharArray()) {
            mag.put(ch, mag.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            if (!mag.containsKey(ch) || ran.get(ch) > mag.get(ch)) return false;
        }

        return true;
    }

    static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}

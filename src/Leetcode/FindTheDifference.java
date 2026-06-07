package Leetcode;

import java.util.Arrays;

// Leetcode no.389
public class FindTheDifference {
    static public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for (char ch :  t.toCharArray()) {
            count[ch - 'a']--;
        }

        int pos = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == -1) pos = i;
        }
        return (char) ('a' + pos);
    }

    static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char result = findTheDifference(s, t);
        System.out.println(result);
    }
}

package String;

import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);
        for (int i = 0; i < s1.length(); i++) {
            if (s1Chars[i] != s2Chars[i]) {
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(isAnagram(str1, str2));
    }
}

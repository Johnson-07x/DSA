package Collections.sets;

import java.util.HashSet;
import java.util.Set;


// to be continued
public class ValidAnagram {
    static public boolean isAnagram(String s, String t) {
        Set<Character> set = new HashSet<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {

        }
        return true;
    }

    static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}

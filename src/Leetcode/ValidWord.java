package Leetcode;

import java.util.Arrays;
import java.util.List;

// Leetcode no. 3136
class Solution10 {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        int vowelCount = 0;
        int consonantCount = 0;
        List<Character> vowels = Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        for (int i = 0; i < word.length() ; i++) {
            char ch = word.charAt(i);
            if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                System.out.println("not proper value");
                return false;
            }
            if (vowels.contains(ch)) {
                vowelCount++;
            } else if (!Character.isDigit(ch)) {
                consonantCount++;
            }
        }
        if (vowelCount == 0 && consonantCount == 0) {
            return false;
        }
        return true;
    }
}

public class ValidWord {
    static void main(String[] args) {
        String str = "234Adas";
        Solution10 s10 = new Solution10();
        System.out.println(s10.isValid(str));
    }
}
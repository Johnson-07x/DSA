package Leetcode;

// Leetcode no.125
public class ValidPalindrome {
    static public String removeNonAlpha(String s, String original) {
        if (original.isEmpty()) {
            return s;
        }
        char ch = Character.toLowerCase(original.charAt(0));
        if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
            return removeNonAlpha(s + ch, original.substring(1));
        }
        return removeNonAlpha(s, original.substring(1));
    }

    static public boolean isPalindrome(String s) {
        String formatedString = removeNonAlpha("", s);
        int left = 0;
        int right = formatedString.length() - 1;
        while (left < right) {
            if (formatedString.charAt(left) != formatedString.charAt(right)) return false;
            left += 1;
            right -= 1;
        }
        return true;
    }

    static void main(String[] args) {
        boolean result = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }
}

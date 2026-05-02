package Leetcode;

// Leetcode no.5
public class LongestPalindromicSubstring {
    static public boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    static public String longestPalindrome(String s) {
        int n = s.length();
        String result = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String temp = s.substring(i, j);
                if (checkPalindrome(temp)) {
                    if (temp.length() > result.length()) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

    static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        System.out.println(result);
    }
}

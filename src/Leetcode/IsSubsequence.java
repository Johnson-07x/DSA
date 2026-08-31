package Leetcode;

// Leetcode no.392
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;

        int count = 0;
        char ch = s.charAt(count);
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == ch) {
                count++;
                if (count == s.length()) return true;
                ch = s.charAt(count);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean result = isSubsequence(s, t);
        System.out.println(result);
    }
}

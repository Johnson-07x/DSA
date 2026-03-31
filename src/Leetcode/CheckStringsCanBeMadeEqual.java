package Leetcode;

// Leetcode no.2839
public class CheckStringsCanBeMadeEqual {
    static public boolean canBeEqual(String s1, String s2) {
        boolean evenMatch = (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)) ||
                (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0));

        boolean oddMatch = (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) ||
                (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1));

        return evenMatch && oddMatch;
    }

    static void main() {
        String s1 = "abcd";
        String s2 = "cdab";
        boolean result = canBeEqual(s1, s2);
        System.out.println(result);
    }
}

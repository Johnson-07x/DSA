package Leetcode;


// Leetcode no.1392
public class LongestHappyPrefix {
    static public String longestPrefix(String s) {
        int n = s.length();

        for (int i = n - 1; i > 0; i--) {
            if (s.substring(0, i).equals(s.substring(n - i))) {
                return s.substring(0, i);
            }
        }

        return "";
    }

    static void main(String[] args) {
        String s = "level";
        String result = longestPrefix(s);
        System.out.println(result);
    }
}

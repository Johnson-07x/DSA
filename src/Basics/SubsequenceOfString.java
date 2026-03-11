package Basics;

public class SubsequenceOfString {
    static void subsequence(String s, String current, int index) {
        if (index == s.length()) {
            System.out.println(current);
            return;
        }
        subsequence(s, current + s.charAt(index), index + 1);
        subsequence(s, current, index + 1);
    }

    static void main(String[] args) {
        String s = "ABC";
        subsequence(s, "", 0);
    }
}

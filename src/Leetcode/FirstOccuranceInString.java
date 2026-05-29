package Leetcode;

// Leetcode no.28
public class FirstOccuranceInString {
    static public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }
}

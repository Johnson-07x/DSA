package Leetcode;

// Leetcode no.1910
public class RemoveAllOccurrencesOfAstring {
    static public String removeOccurrences(String s, String part) {
        if (s.contains(part)) s = s.replaceFirst(part, "");
        if (!s.contains(part)) return s;
        return removeOccurrences(s, part);
    }

    static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        String result = removeOccurrences(s, part);
        System.out.println(result);
    }
}

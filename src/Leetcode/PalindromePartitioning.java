package Leetcode;

import java.util.ArrayList;
import java.util.List;

// Leetcode no.131
public class PalindromePartitioning {
    static public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        backtrack(s, 0, current, result);
        return result;
    }

    static private void backtrack(String s, int start, List<String> current, List<List<String>> result) {
        // Base case: if we've processed the entire string
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try all possible endings from current start position
        for (int end = start; end < s.length(); end++) {
            // Check if substring s[start..end] is a palindrome
            if (isPalindrome(s, start, end)) {
                // Add the palindrome substring to current path
                current.add(s.substring(start, end + 1));
                // Recurse with next start position
                backtrack(s, end + 1, current, result);
                // Backtrack - remove the last added substring
                current.remove(current.size() - 1);
            }
        }
    }

    // Helper method to check if substring s[left..right] is palindrome
    static public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = partition(s);
        System.out.println(result);
    }
}

package Leetcode;

// Leetcode no.1328
class Solution6 {
    public String breakPalindrome(String palindrome) {
        int length = palindrome.length();
        if (length <= 1) {
            return "";
        }
        char arr[] = palindrome.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return new String(arr);
            }
        }
        arr[length - 1] = 'b';
        return new String(arr);
    }
}

public class BreakPalindrome {
    static void main(String[] args) {
        String str = "abccba";
        Solution6 s6 = new Solution6();
        System.out.println(s6.breakPalindrome(str));
    }
}

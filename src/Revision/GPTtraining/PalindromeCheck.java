package Revision.GPTtraining;

public class PalindromeCheck {
    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;

        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String name = "madam";
        boolean result = isPalindrome(name, 0, name.length() - 1);
        System.out.println(result);
    }
}

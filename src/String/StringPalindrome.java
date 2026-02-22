package String;

public class StringPalindrome {
    static boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < str.length()) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        String str = "madam";
        System.out.println(checkPalindrome(str));
    }
}

package Leetcode;

// Leetcode no.151
public class ReverseWordsInString {
    static public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String result = "";
        for (String a : arr) {
            if (a.isEmpty() || result.isEmpty()) {
                result = a + result;
            } else {
                result = a + " " + result;
            }
        }
        return result;
    }

    static void main(String[] args) {
        String s = "a good   example";
        String result = reverseWords(s);
        System.out.println(result);
    }
}

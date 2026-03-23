package Leetcode;

import java.util.LinkedList;
import java.util.List;

// incomplete sum -> to be continued.../
// Leetcode no.151
public class ReverseWordsInString {
    static public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String result = "";
        for (String a : arr) {
            result = a + " " + result;
        }
        return result;
    }

    static void main(String[] args) {
        String s = "  hello world  ";
        String result = reverseWords(s);
        System.out.println(result);
        List<Integer> l = new LinkedList<>();

    }
}

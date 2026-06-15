package Kunal.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsequenceOfString {
    public static List<String> printSubsequence(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);
        List<String> left = printSubsequence(processed + ch, unProcessed.substring(1));

        List<String> right = printSubsequence(processed, unProcessed.substring(1));

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> result = printSubsequence("", s);
        System.out.println(result);
    }
}

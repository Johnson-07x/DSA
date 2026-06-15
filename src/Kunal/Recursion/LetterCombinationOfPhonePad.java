package Kunal.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhonePad {
    public static void printCombination(String result, String str) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        int digit = str.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            printCombination(result + ch, str.substring(1));
        }
    }

    // Returing as a ArrayList
    public static List<String> storeCombinations(String result, String str) {
        if (str.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }

        int digit = str.charAt(0) - '0' - 1;
        List<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            ans.addAll(storeCombinations(result + ch, str.substring(1)));
        }

        return ans;
    }

    // Leetcode method
    static public List<String> letterCombinations(String digits) {
        return storeCombinations("", digits);
    }

    public static void main(String[] args) {
        String num = "12";
        printCombination("", num);
        List<String> result = letterCombinations("23");
        System.out.println(result);
    }
}

package Leetcode;

import java.util.LinkedList;
import java.util.List;

// Leetcode no.17
public class LetterCombinationsOfphoneNumber {
    static public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();

        // Edge case: empty input
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        // Array index matches the phone number digit directly
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        // Seed the queue with an empty string to start the process
        result.add("");

        // Loop through each digit in the input string
        for (int i = 0; i < digits.length(); i++) {
            int digitIdx = digits.charAt(i) - '0';
            String letters = keypad[digitIdx];

            // Process only the combinations generated from the previous step
            while (result.peek().length() == i) {
                String currentPermutation = result.remove(); // Get oldest element

                // Append every possible new letter to the old element
                for (char letter : letters.toCharArray()) {
                    result.add(currentPermutation + letter);
                }
            }
        }

        return result;
    }

    static void main(String[] args) {
        String digit = "23";
        List<String> result = letterCombinations(digit);
        System.out.println(result);
    }
}

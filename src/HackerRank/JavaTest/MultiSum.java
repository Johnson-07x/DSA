package HackerRank.JavaTest;

import java.util.*;

/* 1. Java: Multi Sum
Given a bare class, Arithmetic, write a method, sum, that accepts an array as an argument. Overload it to process an array of Integer or String types as follows.
For an Integer array, return the sum of the elements.
For a String array, concatenate the strings in order.

Function Description
Create the sum methods in the editor below.
For an Integer array, the signature is:

public Integer sum (Integer [] ints) {
//sum the integers
//return the sum
}

Overload this function for the String type as well.
Returns -> String or Integer: the sum as described

Constraints
1 ≤ length of array ≤ 100
For an integer array, they are in the inclusive range [1, 100].
For a string array,
they consist of lowercase and uppercase English letters only.
their lengths do not exceed 100. */

class Arithmetic {
    // Method for Integer array
    public Integer sum(Integer[] ints) {
        int total = 0;
        for (int num : ints) {
            total += num;
        }
        return total;
    }

    // Overloaded method for String array
    public String sum(String[] stringArr) {
        StringBuilder sb = new StringBuilder();
        for (String s : stringArr) {
            sb.append(s);
        }
        return sb.toString();
    }
}

public class MultiSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmetic a = new Arithmetic();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] tokens = line.split("\\s+");

            // Check if the first token is a number to decide which 'sum' to call
            if (isNumber(tokens[0])) {
                Integer[] ints = new Integer[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    ints[i] = Integer.parseInt(tokens[i]);
                }
                System.out.println(a.sum(ints));
            } else {
                // If it's not a number, treat the whole line as a String array
                System.out.println(a.sum(tokens));
            }
        }
        sc.close();
    }

    // Helper method to check if a string is an integer
    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

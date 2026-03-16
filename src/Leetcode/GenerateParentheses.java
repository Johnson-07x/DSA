package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Leetcode no.22
public class GenerateParentheses {
    static void backtrack(List<String> result, String s, int openCount, int closeCount, int n) {
        if (s.length() == n * 2) {
            result.add(s);
            return;
        }
        if (openCount < n) {
            backtrack(result, s + "(", openCount + 1, closeCount, n);
        }
        if (closeCount < openCount) {
            backtrack(result, s + ")", openCount, closeCount + 1, n);
        }
    }

    static public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        List<String> l = generateParenthesis(n);
        System.out.println(l);
    }
}
package Leetcode;

import java.util.ArrayList;
import java.util.List;

// Leetcode no.118
public class PascalsTriangle {
    static void displayTriangle(List<List<Integer>> result) {
        int size = result.size();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            System.out.println(result.get(i));
        }
    }

    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int j = 0; j < i - 1; j++) {
                current.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            current.add(1);

            result.add(current);
        }

        return result;
    }

    static void main(String[] args) {
        int n = 5;
        List<List<Integer>> result = generate(n);
        displayTriangle(result);
    }
}

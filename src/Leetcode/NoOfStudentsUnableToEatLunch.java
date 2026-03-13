package Leetcode;

import java.util.*;

// Leetcode no.1700
public class NoOfStudentsUnableToEatLunch {
    static public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sandwich = new Stack<>();
        Queue<Integer> student = new LinkedList<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sandwich.push(sandwiches[i]);
        }
        for (int e : students) {
            student.add(e);
        }

        int attempt = 0;
        while (!student.isEmpty() && attempt < student.size()) {
            if (sandwich.peek().equals(student.peek())) {
                sandwich.pop();
                student.remove();
                attempt = 0;
            } else {
                student.add(student.remove());
                attempt++;
            }
        }

        return student.size();
    }

    static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};
        int result = countStudents(students, sandwiches);
        System.out.println(result);
    }
}

package Leetcode;

// Leetcode no.2169
public class CountOperationsToObtainZero {
    static public int countOperations(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        if (num1 >= num2) {
            return 1 + countOperations(num1 - num2, num2);
        }

        return 1 + countOperations(num1, num2 - num1);
    }

    static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        System.out.println(countOperations(num1, num2));
    }
}

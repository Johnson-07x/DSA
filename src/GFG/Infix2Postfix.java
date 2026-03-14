package GFG;

import java.util.Stack;

public class Infix2Postfix {
    static int precedence(char ch) {
        if (ch == '^') return 3;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '+' || ch == '-') return 1;
        return -1;
    }

    public static String infixToPostfix(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }

            // (
            else if (ch == '(') {
                stack.push(ch);
            }

            // )
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }

            // Operator
            else {

                while (!stack.isEmpty() &&
                        (precedence(stack.peek()) > precedence(ch) ||
                                (precedence(stack.peek()) == precedence(ch) && ch != '^'))) {

                    result.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    static void main(String[] args) {
        String s = "a*(b+c)/d";
        String result = infixToPostfix(s);
        System.out.println(result);
    }
}

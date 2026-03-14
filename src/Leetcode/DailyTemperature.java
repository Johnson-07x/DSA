package Leetcode;

import java.util.Arrays;
import java.util.Stack;

// Leetcode no.739
public class DailyTemperature {
    static public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!s.isEmpty() && temperatures[s.peek()] < temperatures[i]) {
                int index = s.pop();
                ans[index] = i - index;
            }
            s.push(i);
        }
        return ans;
    }

    static void main(String[] args) {
        int[] temperature = {73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures(temperature);
        System.out.println(Arrays.toString(result));
    }
}

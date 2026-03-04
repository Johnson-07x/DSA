package Leetcode;

import java.util.LinkedList;
import java.util.List;

// Leetcode no.121
public class BestTimeToBuyAndSellStock {
    static public int maxProfit(int[] prices) {
        List<Integer> list = new LinkedList<>();
        for (int e : prices) {
            list.add(e);
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int e : list) {
            min = Math.min(min, e);
            max = Math.max(max, e - min);
        }
        return max;
    }

    static void main(String[] args) {
        int[] arr = {2,4,1};
        int result = maxProfit(arr);
        System.out.println(result);
    }
}

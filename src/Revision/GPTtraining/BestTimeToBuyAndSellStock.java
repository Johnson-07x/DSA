package Revision.GPTtraining;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] price) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : price) {
            min = Math.min(min, n);
            max = Math.max(max, n - min);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }
}

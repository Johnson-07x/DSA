package Revision;

public class ChocolateFeast {
    static int buyChocolate(int totalAmount, int chocolateAmt, int wrapperExchange) {
        int chocolateAte = totalAmount / chocolateAmt;
        int wrapperCount = chocolateAte;

        while (wrapperCount >= wrapperExchange) {
            int redeemed = wrapperCount / wrapperExchange;
            wrapperCount %= wrapperExchange;
            wrapperCount += redeemed;
            chocolateAte += redeemed;
        }

        return chocolateAte;
    }

    static void main(String[] args) {
        int n = 15;
        int c = 3;
        int m = 2;

        int result = buyChocolate(n,c,m);
        System.out.println(result);
    }
}

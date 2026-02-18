package HackerRank;

import java.util.Scanner;

public class ChocolateFeast {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount he have: ");
        int money = sc.nextInt();
        System.out.print("Enter cost of the Chocolate: ");
        int cost = sc.nextInt();
        System.out.print("Enter the trade Wrapper count: ");
        int tradeValue = sc.nextInt();

        int wrapperCount = money / cost;
        int totalChocolate = 0;
        while (wrapperCount >= tradeValue) {
            totalChocolate += wrapperCount;
            if ((wrapperCount % tradeValue) != 0) {
                wrapperCount /= tradeValue + 1;
            } else {
                wrapperCount /= tradeValue;
            }
        }
        System.out.println(totalChocolate);
    }
}

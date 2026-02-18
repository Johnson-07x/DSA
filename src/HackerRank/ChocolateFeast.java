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
        int totalChocolate = wrapperCount;
        while (wrapperCount >= tradeValue) {
            int freeChocolate = wrapperCount / tradeValue;
            totalChocolate += freeChocolate;
            wrapperCount = (wrapperCount % tradeValue) + freeChocolate;
        }
        System.out.println(totalChocolate);
    }
}

package HackerRank;

import java.util.Scanner;

public class ViralAdvertising {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Days: ");
        int days = sc.nextInt();
        int shares = 5;
        int currentLikes = 0;
        int totalLikes = 0;
//        for (int i = 0; i < days; i++) {
//            currentLikes = shares / 2;
//            totalLikes += currentLikes;
//            shares = currentLikes * 3;
//        }
//        System.out.println(totalLikes);

        while (days > 0) {
            currentLikes = shares / 2;
            totalLikes += currentLikes;
            shares = currentLikes * 3;
            days--;
        }
        System.out.println(totalLikes);
    }
}

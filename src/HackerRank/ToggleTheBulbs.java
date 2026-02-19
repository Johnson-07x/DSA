package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class ToggleTheBulbs {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n = sc.nextInt();
        boolean[] bulb = new boolean[n];
        Arrays.fill(bulb, true);
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j += i + 1) {
                bulb[j] = !bulb[j];
            }
        }
//        bulb[n] = !bulb[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (bulb[i]) {
                count++;
            }
        }
        System.out.println(count);


//        System.out.println((int) Math.sqrt(n));
    }
}

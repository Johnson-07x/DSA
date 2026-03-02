package Exception;

import java.util.Scanner;

public class BunjeeJumping {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Your Age: ");
            int age = sc.nextInt();
            if (!((age >= 18) && (age <= 45))) {
                throw new InvalidException("Age Constraint is not met");
            }
            System.out.print("Enter Your Weight: ");
            int weight = sc.nextInt();
            if (!((weight >= 50) && (weight <= 80))) {
                throw new RuntimeException("Weight Constraint is not met");
            }
            System.out.println("You are Eligible for Bungee Jumping");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

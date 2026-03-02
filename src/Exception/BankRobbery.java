package Exception;

import java.util.Scanner;

public class BankRobbery {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fbiCount = 40;
        System.out.println("Welcome to RK Bank");
        System.out.println("Ready to Rob???");
        try {
            System.out.print("Enter the Team Size: ");
            int teamSize = sc.nextInt();
            if (fbiCount > teamSize * 2) {
                throw new InvalidException("You can't Manage the FBI Team");
            }
            System.out.print("Have You captured Hostages? ");
            boolean capturedHostages = sc.nextBoolean();
            if (!capturedHostages) {
                throw new InvalidException("If there's no Hostage FBI definitely Kills Your Team");
            }
            System.out.print("Do you have Powerful weapons? ");
            boolean weapons = sc.nextBoolean();
            if (!weapons) {
                throw new InvalidException("If there's no Weapons definitely FBI Kills Your Team");
            }

            System.out.print("Do you have Hackers Team? ");
            boolean hackers = sc.nextBoolean();
            if (!hackers) {
                throw new InvalidException("If there's no hackers you can't Monitor the FBI actions");
            }
            System.out.println("Bank Robbed Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

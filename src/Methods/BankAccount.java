package Methods;

import java.util.Scanner;

public class BankAccount {
    static boolean checkCredentials(String username, String password) {
        String defaultUsername = "root";
        String defaultPassword = "admin";
        if (defaultUsername.equals(username) && defaultPassword.equals(password)) {
            return true;
        }
        return false;
    }

    static int deposit(int currentBalance, int depositAmount) {
        currentBalance += depositAmount;
        return currentBalance;
    }

    static int withdraw(int currentBalance, int withdrawAmount) {
        if (currentBalance < withdrawAmount) {
            return 0;
        }
        currentBalance -= withdrawAmount;
        return currentBalance;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        if (!checkCredentials(username, password)) {
            System.out.println("Credentials are Invalid");
            return;
        }

        int currentBalance = 0;
        int choice = 3;
        while (choice != 0) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to Deposit: ");
                    int depositAmount = sc.nextInt();
                    currentBalance = deposit(currentBalance, depositAmount);
                    System.out.println();
                    System.out.println("Deposit Successful, New Balance: " + currentBalance);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter the amount to Withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    currentBalance = withdraw(currentBalance, withdrawAmount);
                    System.out.println();
                    if (currentBalance == 0) {
                        System.out.println("InSufficient Balance");
                    } else {
                        System.out.println("Withdraw Successful, Current Balance: " + currentBalance);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Current Balance: " + currentBalance);
                    break;
                case 4:
                    return;
                default:
                    System.out.print("Enter correct Option: ");
                    System.out.println();
                    break;
            }
        }
    }
}

package OOPS;

import java.util.Scanner;

class UserAccount {
    private String userName;
    private String password;
    private String email;
    private int loginAttempts;

    public UserAccount(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void login(String userName, String password) {

        if (getLoginAttempts() < 3) {
            if (getUserName().equals(userName)) {
                if (getPassword().equals(password)) {
                    System.out.println();
                    System.out.println("Login Success");
                    System.out.println();
                } else {
                    setLoginAttempts(getLoginAttempts() + 1);
                    System.out.println();
                    System.out.println("Login Unsuccessful");
                    System.out.println();
                }
            } else {
                setLoginAttempts(getLoginAttempts() + 1);
                System.out.println();
                System.out.println("Login Unsuccessful");
                System.out.println();
            }
        } else {
            System.out.println();
            System.out.println("Account Locked Temporarily. Check again in 3 days");
            System.out.println();
        }
    }

    public void resetPassword(String oldPass, String newPass) {
        if (password.equals(oldPass)) {
            setPassword(newPass);
        } else {
            System.out.println();
            System.out.println("Incorrect old password");
            System.out.println();
        }
    }
}

public class UserAccountSecuritySystem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean logout = false;
        UserAccount user = null;
        while (!logout) {
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Reset Password");
            System.out.println("N/A. Logout");
            System.out.println();
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();


            if (choice == 1) {
                System.out.print("Enter username: ");
                String userName = sc.next();
                System.out.print("Enter Password: ");
                String password = sc.next();
                System.out.print("Enter Email: ");
                String email = sc.next();
                user = new UserAccount(userName, password, email);
            } else if (choice == 2) {
                System.out.print("Enter Username: ");
                String userName = sc.next();
                System.out.print("Enter Password: ");
                String password = sc.next();
                user.login(userName, password);
            } else if (choice == 3) {
                System.out.print("Enter Old Password: ");
                String oldPass = sc.next();
                System.out.print("Enter new Password: ");
                String newPass = sc.next();
                user.resetPassword(oldPass, newPass);
            } else {
                logout = true;
            }
        }
    }
}

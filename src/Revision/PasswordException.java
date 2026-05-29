package Revision;

import java.util.Scanner;

class InvalidPassword extends Exception {
    InvalidPassword(String message) {
        super(message);
    }
}

public class PasswordException {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Phone no: ");
        String phone = sc.next();

    }
}

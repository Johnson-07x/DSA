package Exception;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Voting {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new RuntimeException("Not Eligible to vote");
            } else {
                System.out.println("Eligible to vote");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

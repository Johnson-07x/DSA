package Exception;

import java.util.Scanner;

public class Arithmetic {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Hello User");
            System.out.print("Enter num1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter num2: ");
            int num2 = sc.nextInt();
            try {
                System.out.println(num1 / num2);
            } catch (Exception e) {
                System.out.println("Division Error");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Hello World");
        }
    }
}

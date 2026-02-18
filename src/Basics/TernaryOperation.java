package Basics;

public class TernaryOperation {
    static void main(String[] args) {
        int x = 10;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max);
        System.out.println(x++ + ++x);
        System.out.println((y++ + ++y) + y++);
    }
}

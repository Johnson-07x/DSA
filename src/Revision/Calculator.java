package Revision;

// Method Overloading
public class Calculator {
    static int calculate(int a, int b) {
        return a + b;
    }

    static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    static int calculate(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    static int calculate(int a, int b, int c, int d, int e) {
        return a * b * c * d * e;
    }
    static void main(String[] args) {
//        int a = 10;
//        int b = 5;
        System.out.println(calculate(1,2));
        System.out.println(calculate(1,2,3));
        System.out.println(calculate(1,2,3,4));
        System.out.println(calculate(1,2,3,4,5));
    }
}

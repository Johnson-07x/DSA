package Basics;

public class BitManipulation {
    static void main(String[] args) {
        int n = 36;
        int i = 2;
        int onMask = (n | 1 << i);
        int offMask = n & ~(1 << i);
        int toggle = (n ^ i << i);
        System.out.println(onMask);
        System.out.println(offMask);
        System.out.println(toggle);
        boolean check = ((n & 1 << i) == 1 << i);
        if (check) {
            System.out.println("on");
        } else {
            System.out.println("off");
        }
    }
}

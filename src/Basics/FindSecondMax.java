package Basics;

public class FindSecondMax {
    static void main(String[] args) {
//        int a = 10;
//        int b = 5;
//        System.out.println(a & b);
//        System.out.println(a | b);
        int[] arr = {10,60,20,30,80};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int e : arr) {
            if (e > firstMax) {
                secondMax = firstMax;
                firstMax = e;
            }else if (e > secondMax && e != firstMax) {
                secondMax = e;
            }
        }
        System.out.println(secondMax);
    }
}

package Leetcode;

import java.util.Stack;

// Leetcode no.901
class StockSpanner {
    Stack<int[]> s;
//    Stack<Integer> copy;
    public StockSpanner() {
        s = new Stack<>();
    }

    // This Method takes more time complexity
//    public int next(int price) {
//        int count = 1;
//        copy = new Stack<>();
//        copy.addAll(s);
//        if (s.isEmpty() || copy.peek() > price) {
//            s.push(price);
//            return 1;
//        } else {
//            while (!copy.isEmpty() && copy.peek() <= price) {
//                if (copy.pop() <= price) count++;
//            }
//            s.push(price);
//        }
//
//        return count;
//    }

    public int next(int price) {
        int span = 1;
        while (!s.isEmpty() && s.peek()[0] <= price) {
            span += s.pop()[1];
        }
        s.push(new int[] {price, span});
        return span;
    }
}

public class StockSpannerPrblm {
    static void main(String[] args) {
        StockSpanner sp = new StockSpanner();
        int one = sp.next(100);
        int two = sp.next(80);
        int three = sp.next(60);
        int four = sp.next(70);
        int five = sp.next(60);
        int six = sp.next(75);
        int seven = sp.next(85);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
    }
}

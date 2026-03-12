package Stack;

import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoi {
    static Stack<Integer> source = new Stack<>();
    static Stack<Integer> auxilary = new Stack<>();
    static Stack<Integer> destination = new Stack<>();

    static void change(Stack<Integer> s1, Stack<Integer> s2, char p1, char p2) {
        int v1, v2;
        if (s1.isEmpty()) {
            v1 = Integer.MAX_VALUE;
        } else {
            v1 = s1.pop();
        }

        if (s2.isEmpty()) {
            v2 = Integer.MAX_VALUE;
        } else {
            v2 = s2.pop();
        }

        if (v1 == Integer.MAX_VALUE) {
            s1.push(v2);
            System.out.println(p2 + "-->" + p1);
        } else if (v2 == Integer.MAX_VALUE) {
            s2.push(v1);
            System.out.println(p1 + "-->" + p2);
        } else if (v1 < v2) {
            s2.push(v2);
            s2.push(v1);
            System.out.println(p1 + "-->" + p2);
        } else if (v2 < v1) {
            s1.push(v1);
            s1.push(v2);
            System.out.println(p2 + "-->" + p1);
        }
    }

    // Recursive fn
    static void change(int n, char src, char aux, char dest) {
        if (n == 1) {
            System.out.println(src + "-->" + dest);
            return;
        }
        change(n - 1, src, dest, aux);
        change(1, src, aux, dest);
        change(n - 1, aux, src, dest);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char s = 'S';
        char d = 'D';
        char a = 'A';
        for (int i = n; i >= 1; i--) {
            source.push(i);
        }
        if (n % 2 == 0) {
            char temp = a;
            a = d;
            d = temp;
        }
        int moves = (int) (Math.pow(2,n) - 1);
        for (int i = 1; i <= moves; i++) {
            if (i % 3 == 1) {
                change(source, destination, s, d);
            } else if (i % 3 == 2) {
                change(source, auxilary, s, a);
            } else if (i % 3 == 0) {
                change(auxilary, destination, a, d);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        change(n, 'S', 'A', 'D');
    }
}

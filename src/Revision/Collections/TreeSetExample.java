package Revision.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(10);
        t.add(2);
        t.add(34);
        t.add(12);
        t.add(65);

        System.out.println(t.first());
        System.out.println(t.last());

        System.out.println(t.higher(2));
        System.out.println(t.lower(2));

        System.out.println(t.ceiling(30));
        System.out.println(t.floor(30));
        System.out.println(t);

        // Printing tree in reverse order
        Iterator<Integer> it = t.descendingIterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}

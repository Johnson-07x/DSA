package Revision;

import java.util.ArrayList;

// Hi, true, 96, 23, 72, ''a, 12, 10
public class TwistQuestArrayList {
    static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("Hi");
        arr.add(true);
        arr.add(96);
        arr.add(23);
        arr.add('w');
        arr.add(96.7);
        arr.add('a');
        for (Object o : arr) {
            if (o.getClass() == Integer.class) {
                System.out.println(o);
            }
        }
    }
}

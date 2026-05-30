package Revision;

import java.util.ArrayList;
import java.util.Arrays;

public class Iterator {
    static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        java.util.Iterator<Integer> it = al.iterator();

        while (it.hasNext()) {
            if (it.next() == 20) {
                it.remove();
            }
        }

        for (Integer i : al)
            System.out.println(i);
    }
}

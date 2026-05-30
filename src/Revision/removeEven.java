package Revision;

import java.util.ArrayList;
import java.util.Arrays;

public class removeEven {
    static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        java.util.Iterator<Integer> it = al.iterator();

        while (it.hasNext()) {
            if (it.next() % 2 == 0) it.remove();
        }

        for (Integer i : al) System.out.print(i + " ");
    }
}

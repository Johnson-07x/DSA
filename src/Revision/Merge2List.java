package Revision;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge2List {
    static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(30,40,60,70,80));

        for (Integer e : a2) {
            if (!a1.contains(e)) a1.add(e);
        }

        System.out.println(a1);
    }
}

package Revision.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNum {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,1,5,26,62,1,2,41,4,114));

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (Integer n : list) {
            if (n > max) {
                secondMax = max;
                max = n;
            } else if (n > secondMax && n != max) secondMax = n;
        }

        System.out.println(secondMax);
    }
}

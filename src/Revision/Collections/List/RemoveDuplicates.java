package Revision.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(6,1,5,10,1,5,1,14,5));
        List<Integer> result = new ArrayList<>();

        for (Integer n : list) {
            if (!result.contains(n)) result.add(n);
        }

        System.out.println(result);
    }
}

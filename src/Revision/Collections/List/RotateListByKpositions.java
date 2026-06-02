package Revision.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateListByKpositions {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> result = new ArrayList<>();

        int idx = list.size() - 2;

        for (int i = idx; i < list.size(); i++) {
            result.add(list.get(i));
        }

        for (int i = 0; i < idx; i++) {
            result.add(list.get(i));
        }

        System.out.println(result);
    }
}

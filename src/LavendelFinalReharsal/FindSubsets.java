package LavendelFinalReharsal;

import java.util.ArrayList;
import java.util.List;

public class FindSubsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        for (int n : nums) {
            int size = list.size();

            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(list.get(i));
                newSubset.add(n);
                list.add(newSubset);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> result = subsets(arr);
        System.out.println(result);
    }
}

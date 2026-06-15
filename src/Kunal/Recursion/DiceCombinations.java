package Kunal.Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceCombinations {
    public static void printCombination(String result, int target) {
        if (target == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            printCombination(result + i, target - i);
        }
    }

    public static List<String> storeCombinations(String result, int target) {
        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }

        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(storeCombinations(result + i, target - i));
        }

        return ans;
    }

    public static void main(String[] args) {
        printCombination("", 4);
        List<String> result = storeCombinations("", 4);
        System.out.println(result);
    }
}

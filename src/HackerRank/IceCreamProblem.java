package HackerRank;

import java.util.*;

public class IceCreamProblem {
    public static List<Integer> findUsingMap(int m, List<Integer> arr) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            int currentNum = arr.get(i);
            int remaining = m - currentNum;

            if (result.containsKey(remaining)) {
                return Arrays.asList(result.get(remaining), i + 1);
            }

            result.put(currentNum, i + 1);
        }
        return null;
    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int currentNum = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                if (i != j) {
                    if (currentNum + arr.get(j) == m) {
                        result.add(i + 1);
                        result.add(j + 1);
                        break;
                    }
                }
            }
            if (!result.isEmpty()) {
                break;
            }
        }
        return result;
    }

    static void main(String[] args) {
        List<Integer> list = List.of(1, 4, 5, 3, 2);
        int money = 6;
        System.out.println(icecreamParlor(money, list));
        System.out.println(findUsingMap(money, list));
    }
}

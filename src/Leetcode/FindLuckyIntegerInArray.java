package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Leetcode no.1394
public class FindLuckyIntegerInArray {
    static public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : arr) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        int max = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Objects.equals(entry.getKey(), entry.getValue())) {
                max = Math.max(max, entry.getValue());
            }
        }
        return max;
    }

    static void main(String[] args) {
        int[] arr = {2,2,2,3,3};
        int result = findLucky(arr);
        System.out.println(result);
    }
}

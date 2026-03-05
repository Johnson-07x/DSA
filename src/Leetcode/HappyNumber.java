package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Leetcode no.202
public class HappyNumber {
    static public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 4);
        map.put(3, 9);
        map.put(4, 16);
        map.put(5, 25);
        map.put(6, 36);
        map.put(7, 49);
        map.put(8, 64);
        map.put(9, 81);

        Set<Integer> s = new HashSet<>();
        int result = 0;
        while (n > 0) {
            int current = n % 10;
            result += map.get(current);
            s.add(result);
            n /= 10;
        }

        if (result == 1) {
            return true;
        }

        if (result == 4) {
            return false;
        }

        return isHappy(result);
    }

    static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }
}

package Revision.Collections.Map;

import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Apple", 10, "Banana", 5, "Orange", 20);

        String maxKey = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println("Key with highest value: " + maxKey); // Orange
    }
}

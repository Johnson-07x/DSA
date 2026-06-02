package Revision.Collections.Map;

import java.util.*;

public class SortMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Apple", 50);
        map.put("Banana", 10);
        map.put("Cherry", 30);

        // 1. Convert Map entries to a List
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

        // 2. Sort the list with an anonymous custom Comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue()); // Ascending order
            }
        });

        // 3. Copy sorted elements into a LinkedHashMap to preserve order
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Map: " + sortedMap);
        // Output: {Banana=10, Cherry=30, Apple=50}
    }
}

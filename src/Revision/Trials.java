package Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Trials {
    public static String sortString(String s) {
        TreeMap<Character, Integer> m = new TreeMap<>();

        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> (b.getValue()) - (a.getValue())
        );

        pq.addAll(m.entrySet());

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            int val = entry.getValue();

            for (int i = 0; i < val; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int String = 016;
        System.out.println(String);

        String str = "repeater";
        String result = sortString(str);
        System.out.println(result);
    }
}

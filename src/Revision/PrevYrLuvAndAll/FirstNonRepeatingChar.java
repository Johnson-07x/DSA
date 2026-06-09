package Revision.PrevYrLuvAndAll;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    static public char firstNonRepeatingChar(String str) {
        Map<Character, Integer> m = new HashMap<>();

        for (char ch : str.toCharArray()) {
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (m.get(ch) == 1) return ch;
        }

        return 0;
    }

    public static void main(String[] args) {
        String s = "swiwsis";
        char result = firstNonRepeatingChar(s);
        System.out.println(result);
    }
}

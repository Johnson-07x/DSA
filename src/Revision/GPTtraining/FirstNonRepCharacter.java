package Revision.GPTtraining;

import java.text.StringCharacterIterator;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepCharacter {
    public static char nonRepChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) return ch;
        }

        return '\0';
    }

    public static void main(String[] args) {
        String s = "aabb";
        char result = nonRepChar(s);
        System.out.println(result);
    }
}

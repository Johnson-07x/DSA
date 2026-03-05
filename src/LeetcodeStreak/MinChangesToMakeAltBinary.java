package LeetcodeStreak;

import java.util.LinkedList;
import java.util.List;

// to be continued...
// Leetcode no.1758
public class MinChangesToMakeAltBinary {
    static public int minOperations(String s) {
        if (s.length() <= 1) {
            return 0;
        }
        List<Character> l = new LinkedList<>();
        int count = 0;
        l.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == l.getLast()) {
                count++;
                if (ch == '1') {
                    l.addLast('0');
                } else {
                    l.addLast('1');
                }
            } else {
                l.addLast(ch);
            }
        }
        return count;
    }

    static void main(String[] args) {
        String s = "10010100";
        int result = minOperations(s);
        System.out.println(result);
    }
}

package Leetcode;

import java.util.HashSet;
import java.util.Set;

//Not completed properly
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!set.contains(letter)) {
                set.add(letter);
                max++;
            } else if (s.charAt(i - 1) != letter && set.contains(letter)) {
                set.clear();
                set.add(letter);
                max = 2;
            } else {
                set.clear();
                set.add(letter);
                max = 1;
            }
            ans = Math.max(ans, max);
        }

        return ans;
    }
}

public class LongestSubArrayWithoutRepeatingElements {
    static void main(String[] args) {
        String str = "abcabcbb";
        Solution3 s3 = new Solution3();
        System.out.println(s3.lengthOfLongestSubstring(str));
    }
}

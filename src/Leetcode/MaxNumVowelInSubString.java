package Leetcode;

// Leetcode no.1456
class Solution18 {
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int maxVowels(String s, int k) {
        int length = s.length();
        int count = 0;
        int maxCount = 0;
        for (int i = 0 ; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        maxCount = count;
        for (int i = k; i < length; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
}

public class MaxNumVowelInSubString {
    static void main(String[] args) {
        Solution18 s18 = new Solution18();
        String s = "abciiidef";
        int k = 3;
        System.out.println(s18.maxVowels(s, k));
    }
}

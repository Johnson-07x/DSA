package LeetcodeStreak;

public class MinNumberOfFlipsToMakeTheBinaryStringAlternating {
    static public int minFlips(String s) {
        int n = s.length();
        String s2 = s + s;
        int min = Integer.MAX_VALUE;

        int diff1 = 0;
        int diff2 = 0;
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            char p1 = (i % 2 == 0) ? '0' : '1';
            char p2 = (i % 2 == 0) ? '1' : '0';

            if (p1 != ch) diff1++;
            if (p2 != ch) diff2++;

            if (i >= n) {
                int left = i - n;
                char newChar = s2.charAt(left);

                char newP1 = (i % 2 == 0) ? '0' : '1';
                char newP2 = (i % 2 == 0) ? '1' : '0';

                if (newP1 != newChar) diff1--;
                if (newP2 != newChar) diff2--;
            }

            if (i >= n - 1) {
                min = Math.min(min, Math.min(diff1, diff2));
            }
        }

        return min;
    }

    static void main(String[] args) {
        String s = "111000";
        int result = minFlips(s);
        System.out.println(result);
    }
}

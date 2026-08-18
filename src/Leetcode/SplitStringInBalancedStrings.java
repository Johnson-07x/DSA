package Leetcode;

public class SplitStringInBalancedStrings {
    static public int balancedStringSplit(String s) {
        int rCount = 0;
        int lCount = 0;

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') rCount++;
            else lCount++;

            if (rCount - lCount == 0) {
                count++;
                rCount = 0;
                lCount = 0;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "RLRRLLRLRL";
        int result = balancedStringSplit(str);
        System.out.println(result);
    }
}

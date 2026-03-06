package LeetcodeStreak;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    static public boolean checkOnesSegment(String s) {
        boolean swapped = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                swapped = true;
            }

            if (s.charAt(i) == '1' && swapped) {
                return false;
            }
        }

        return true;
    }

    static void main(String[] args) {
        String s = "1001";
        boolean result = checkOnesSegment(s);
        System.out.println(result);
    }
}

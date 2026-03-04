package LeetcodeStreak;

// Leetcode no.1545
public class FindKthBitInBinaryString {
    static String revString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                sb.setCharAt(i, '0');
            } else {
                sb.setCharAt(i, '1');
            }
        }
        return sb.reverse().toString();
    }

    static String find(int n) {
        if (n == 1) {
            return "0";
        }
        String result = find(n - 1);
        return result + "1" + revString(result);
    }

    static public char findKthBit(int n, int k) {
        String s = find(n);
        return s.charAt(k - 1);
    }

    static void main(String[] args) {
        int n = 4;
        int k = 12;
        System.out.println(findKthBit(n, k));
    }
}

package Leetcode;

// to be continued.../
// Leetcode no.443
public class StringCompression {
    static public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }
            if (count == 1) {
                chars[idx++] = ch;
            } else {
                chars[idx++] = ch;
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[idx++] = digit;
                }
            }
            i--;
        }
        return idx;
    }

    static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int result = compress(chars);
        System.out.println(result);
    }
}

package Leetcode;

// to be continued.../
// Leetcode no.443
public class StringCompression {
    static public int compress(char[] chars) {
        char prev = 0;
        boolean changed = false;
        int length = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (prev != chars[i]) {
                prev = chars[i];
                length = 1;
                changed = true;
            } else {
                length++;
            }

            if (changed) {
                if (length == 1) s.append(prev);
                else {
                    s.append(prev);
                    s.append(length);
                }
            }
        }

        return s.toString().length();
    }

    static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int result = compress(chars);
        System.out.println(result);
    }
}

package Leetcode;

// Leetcode no.6
public class ZigzagConversion {
    static public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int idx = 0;
        boolean toogle = true;
        for (char c : s.toCharArray()) {
            if (idx == 0 || idx == numRows - 1) toogle = !toogle;

            sb[idx].append(c);

            idx += toogle ? -1 : 1;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(sb[i]);
        }

        return result.toString();
    }

    static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int rows = 3;
        String result = convert(s, rows);
        System.out.println(result);
    }
}

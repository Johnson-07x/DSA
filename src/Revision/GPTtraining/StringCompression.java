package Revision.GPTtraining;

public class StringCompression {
    public static String compress(String s) {
        if (s == null || s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            int count = 0;
            while (i < n && s.charAt(i) == curr) {
                count++;
                i++;
            }
            sb.append(curr);
            sb.append(count);
            i--;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abbcccdddde";
        String result = compress(s);

        System.out.println(result);
    }
}

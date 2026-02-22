package String;

public class StringCompression {
    static void main(String[] args) {
        String str = "aaabbcc";
        String compressedStr = "";

        int count = 0;
        char c = str.charAt(0);
        for (char e : str.toCharArray()) {
            if (c == e) {
                count++;
            } else {
                compressedStr += c + "" + count;
                c = e;
                count = 1;
            }
        }
        compressedStr += c + "" + count;
        System.out.println(compressedStr);
    }
}

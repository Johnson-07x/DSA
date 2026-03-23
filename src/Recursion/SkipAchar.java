package Recursion;

public class SkipAchar {
    static void skip(String modified, String actual) {
        if (actual.length() == 0) {
            System.out.println(modified);
            return;
        }
        char ch = actual.charAt(0);
        if (ch == 'a') skip(modified, actual.substring(1));
        else skip(modified + ch , actual.substring(1));
    }

    static void main(String[] args) {
        String s = "asjfakjgb";
        skip("", s);
    }
}

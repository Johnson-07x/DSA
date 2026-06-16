package Revision.GPTtraining;

public class ReverseString {
    public static String reverse(String s) {
        if (s.isEmpty()) return "";

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String name = "johnson";
        String result = reverse(name);
        System.out.println(result);
    }
}

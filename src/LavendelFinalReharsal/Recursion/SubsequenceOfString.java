package LavendelFinalReharsal.Recursion;

public class SubsequenceOfString {
    public static void printSubsequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        printSubsequence(p + ch, up.substring(1));
        printSubsequence(p, up.substring(1));
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequence("", str);
    }
}

package LavendelFinalReharsal;

public class ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Johnson";
        String result = reverse(str);
        System.out.println(result);
    }
}

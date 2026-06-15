package Kunal.Recursion;

public class RemoveAcharFromString {
    public static String removeChar(String str) {
        if (str.isEmpty()) return "";

        char ch = str.charAt(0);

        if (ch == 'a') {
            return removeChar(str.substring(1));
        }

        return ch + removeChar(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "johnsoana";
        String result = removeChar(str);
        System.out.println(result);
    }
}

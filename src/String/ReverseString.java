package String;

public class ReverseString {
    static void main(String[] args) {
        String str = "hello";
        String revStr = "";

        int length = str.length() - 1;
        while (length >= 0) {
            revStr += str.charAt(length);
            length--;
        }
        System.out.println(str.equals(revStr));
    }
}

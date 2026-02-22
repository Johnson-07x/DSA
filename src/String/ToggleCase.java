package String;

public class ToggleCase {
    static void main(String[] args) {
        String str = "JaVa";
        String newStr = "";

        for (char e : str.toCharArray()) {
            if (Character.isUpperCase(e)) {
                newStr += Character.toLowerCase(e);
            } else {
                newStr += Character.toUpperCase(e);
            }
        }

        System.out.println(newStr);
    }
}

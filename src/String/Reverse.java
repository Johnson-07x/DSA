package String;

public class Reverse {
    static public String reverseString (String name) {
        int n = name.length() - 1;
        StringBuilder s = new StringBuilder();
        for (int i = n; i >= 0; i--) {
            if (i == n || i == 0) {
                s.append(Character.toUpperCase(name.charAt(i)));
                continue;
            }
            s.append(name.charAt(i));
        }
        return s.toString();
    }

    static void main(String[] args) {
        String name = "johnson";
        String result = reverseString(name);

        // Printing data
        System.out.println(result);
        System.out.println(reverseString(result));
    }
}

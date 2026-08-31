package Leetcode;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }

    public static void main(String[] args) {
        String str = "luffy is still joyboy";
        int result = lengthOfLastWord(str);
        System.out.println(result);
    }
}

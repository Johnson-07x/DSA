package Revision;

public class SmallestCharInString {
    static char findSmall(String s) {
        boolean[] chars = new boolean[26];
        for (char c : s.toCharArray()) {
            char ch = Character.toLowerCase(c);
            chars[ch - 'a'] = true;
        }

        for (int i = 0; i <= 26; i++) {
            if (!chars[i]) return (char) (i + 97);
        }

        return 0;
    }

//    static char rameshMethod(String s) {
//        String s1 = s;
//        String s2 = "abcdefghijklmnopqrstuvwxyz";
//        for (int i = 0; i < s1.length(); i++) {
//            char ch = s1.charAt(i);
//            if (s2.contains()) {
//
//            }
//        }
//    }

    static void main(String[] args) {
        String s = "aidubudxd";
        char result = findSmall(s);
        System.out.println(result);

//        System.out.println((char) 122);
    }
}

package Leetcode;

// Leetcode no.3474
public class LexicographicallySmallestString {
    static public String smallestString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        char[] word = new char[n + m - 1];

        // Step 1: fill everything with 'a'
        for (int i = 0; i < word.length; i++) {
            word[i] = 'a';
        }

        // Step 2: apply 'T' constraints
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    // conflict check
                    if (word[i + j] != 'a' && word[i + j] != str2.charAt(j)) {
                        return "";
                    }
                    word[i + j] = str2.charAt(j);
                }
            }
        }

        // Step 3: handle 'F' constraints
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {

                // check if equal to str2
                boolean same = true;
                for (int j = 0; j < m; j++) {
                    if (word[i + j] != str2.charAt(j)) {
                        same = false;
                        break;
                    }
                }

                // if equal → break it
                if (same) {
                    // just change last character in that window
                    if (word[i + m - 1] == 'z') return "";
                    word[i + m - 1]++;
                }
            }
        }

        return new String(word);
    }


    static void main(String[] args) {
        String str1 = "TFTF";
        String str2 = "ab";
        String result = smallestString(str1, str2);
        System.out.println(result);
    }
}

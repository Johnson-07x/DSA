package Revision.LavendalOldQuest;

// Leetcode no.14
public class LongestCommonPrefix {
    static public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        String result = longestCommonPrefix(arr);
        System.out.println(result);
    }
}

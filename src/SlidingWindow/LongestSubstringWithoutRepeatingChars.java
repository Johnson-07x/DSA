package SlidingWindow;

public class LongestSubstringWithoutRepeatingChars {
    static int findLongestSubstring(String s) {
        int start = 0;
        int max = 0;
        boolean[] visited = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (visited[ch]) {
                visited[ch] = false;
                start++;
            }
            visited[ch] = true;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }

    static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(findLongestSubstring(s));
    }
}

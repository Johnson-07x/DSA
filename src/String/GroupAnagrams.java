package String;

import java.util.*;

class Solution {
    static public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}

public class GroupAnagrams {
    static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(Solution.groupAnagrams(arr));
    }
}

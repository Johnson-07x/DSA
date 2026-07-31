package LavendelFinalReharsal;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagram(String[] arr) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : arr) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }

            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagram(arr);
        System.out.println(result);
    }
}

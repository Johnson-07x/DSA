package LeetcodeStreak;

import java.util.ArrayList;
import java.util.List;

// Leetcode no.2452
public class WordsWithin2EditsOfDictionary {
    static boolean checkMatch(String word1, String word2) {
        int nonMatch = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) nonMatch++;
            if (nonMatch > 2) return false;
        }
        return true;
    }

    static public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            String word = queries[i];
            for (int j = 0; j < dictionary.length; j++) {
                if (checkMatch(word, dictionary[j])) {
                    result.add(word);
                    break;
                }
            }
        }

        return result;
    }

    static void main(String[] args) {
        String[] queries = {"word","note","ants","wood"};
        String[] dictionary = {"wood","joke","moat"};

        List<String> result = twoEditWords(queries,  dictionary);
        System.out.println(result);
    }
}

package Revision.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {
    static boolean checkPalindrome(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            if (!list.get(i).equals(list.get(n - i - 1))) return false;
        }
        return true;
    }

    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,1));

        boolean result = checkPalindrome(list);
        System.out.println(result);
    }
}

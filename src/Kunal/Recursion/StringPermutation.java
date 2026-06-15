package Kunal.Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void stringPermute(String result, String str) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        char ch = str.charAt(0);

        for (int i = 0; i <= result.length(); i++) {
            String f = result.substring(0, i);
            String s = result.substring(i, result.length());

            stringPermute(f + ch + s, str.substring(1));
        }
    }

    public static List<String> stringPermuteAL(String result, String str) {
        if (str.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }

        char ch = str.charAt(0);

        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= result.length(); i++) {
            String f = result.substring(0, i);
            String s = result.substring(i);
            ans.addAll(stringPermuteAL(f + ch + s, str.substring(1)));
        }

        return ans;
    }

    public static void main(String[] args) {
        stringPermute("", "ABC");
        List<String> result = stringPermuteAL("", "ABCD");
        System.out.println(result);
    }
}

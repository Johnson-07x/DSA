package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode no.2100
public class GoodDaysToRobTheBank {
    static public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int length = security.length;
        int[] des = new int[length];
        int[] inc = new int[length];

        for (int i = 1; i < length; i++) {
            if (security[i - 1] >= security[i]) {
                des[i] = des[i - 1] + 1;
            }
        }
        for (int i = length - 1; i > 0 ; i--) {
            if (security[i] >= security[i - 1]) {
                inc[i - 1] = inc[i] + 1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (des[i] >= time && inc[i] >= time) {
                list.add(i);
            }
        }
        return list;
    }

    static void main(String[] args) {
        int[] security = {5,3,3,3,5,6,2};
        int time = 2;
        List<Integer> result = goodDaysToRobBank(security, time);
        System.out.println(result);
    }
}

package Leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution16 {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> list = new ArrayList<>();
        for (int i = time; i < security.length - time; i++) {
            if (security[i - time] >= security[i] && security[i] <= security[i + time]) {
                list.add(i);
            }
        }
        return list;
    }
}

public class GoodDaysToRobTheBank {
    static void main(String[] args) {
        int[] security = {1,2,5,4,1,0,2,4,5,3,1,2,4,3,2,4,8};
        int time = 2;
        Solution16 s16 = new Solution16();
        List<Integer> result = s16.goodDaysToRobBank(security, time);
        System.out.println(result);
    }
}

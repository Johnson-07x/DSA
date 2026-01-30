package GFG;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        int n = nums.length;
        if (n < 4) {
            return l;
        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        int l1 = 0;
        int l2 = 1;
        int r1 = n - 2;
        int r2 = n - 1;
        int i = 0;
        while (l2 < r1) {
            int sum = nums[l1] + nums[l2] + nums[r1] + nums[r2];
            if (sum == target) {
                l.add(new ArrayList<>());
                l.get(i).add(nums[l1]);
                l.get(i).add(nums[l2]);
                l.get(i).add(nums[r1]);
                l.get(i).add(nums[r2]);
                i++;
            }
            l1++;
            l2++;
            r1--;
            r2--;
        }
        return l;
    }
}

class GFG_4Sum {
    static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        Solution2 s = new Solution2();
        System.out.println(s.fourSum(arr, target));
    }
}
package Revision;

import java.util.*;

public class ThreeSumPlaylist {
    static public Set<List<Integer>> threeSumTarget(int[] nums, int airTime) {
        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] + nums[i + 1] + nums[i + 2] > airTime) {
                break;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum == airTime) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;
                } else if (currentSum < airTime) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    static void main(String[] args) {
        int[] playlist = {7,14,21,19,17,2,29,5};
        Set<List<Integer>> result = threeSumTarget(playlist, 40);
        System.out.println(result);
    }
}

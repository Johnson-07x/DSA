package GFG;

import java.util.Arrays;

class Solution1 {
    int countTriplet(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;

            while (i < j) {
                int sum = arr[i] + arr[j];

                if (sum == arr[k]) {
                    count++;
                    i++;
                    j--;
                }else if (sum < arr[k]) {
                    i++;
                }else {
                    j--;
                }
            }
        }
        return count;
    }
}

public class CountTheTriplets {
    static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] arr = {6,3,4,1,9,2,8};
        System.out.println(s.countTriplet(arr));
    }
}

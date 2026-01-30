package GFG;

class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < n - 2; i++){
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    return true;
                }else if (sum < target) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return false;
    }
}


public class TripletSumGFG {
    static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;
        System.out.println(s.hasTripletSum(arr, target));
    }
}

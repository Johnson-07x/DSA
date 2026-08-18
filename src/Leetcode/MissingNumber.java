package Leetcode;

public class MissingNumber  {
    public static int missingNum(int arr[]) {
        // code here
        int xor1 = 0;
        int xor2 = 0;

        int n = arr.length + 1;

        for (int num : arr) {
            xor1 ^= num;
        }

        for (int i = 1; i <= n; i++) {
            xor2 ^= i;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int result = missingNum(arr);
        System.out.println(result);
    }
}

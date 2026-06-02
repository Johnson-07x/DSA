package Revision.LavendalOldQuest;

public class FindLargestLCM {
    static int findGCD(int a, int b) {
        if (b == 0) return a;

        return findGCD(b, a % b);
    }

    static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    static int maxLCM(int[] arr) {
        int max = Integer.MIN_VALUE;

        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max , findLCM(prev, arr[i]));
            prev = arr[i];
        }
        return max;
    }

    static void main(String[] args) {
        int[] arr = {4,1,3,2,4};
        int result = maxLCM(arr);
        System.out.println(result);
    }
}

package Revision.PrevYrLuvAndAll;

public class FindSecondMax {
    static public int findSecondMax(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {2,8,54,56};
        int result = findSecondMax(arr);
        System.out.println(result);
    }
}

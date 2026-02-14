package Leetcode;

// Leetcode no.1390

class Solution7 {
    public int sumFourDivisors(int[] nums) {
        int result = 0;
        for (int e : nums) {
            int sum = 0;
            int count = 0;
            for (int i = 1; i <= e; i++) {
                if (e % i == 0) {
                    sum += i;
                    count++;
                }
                if (count > 4) {
                    break;
                }
            }
            if (count == 4) {
                result += sum;
            }
        }
        return result;
    }
}

public class FourDivisors {
    static void main(String[] args) {
        int arr[] = {1,2,4,8,16};
        Solution7 s7 = new Solution7();
        System.out.println(s7.sumFourDivisors(arr));
    }
}

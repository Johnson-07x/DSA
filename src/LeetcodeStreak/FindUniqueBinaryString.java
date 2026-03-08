package LeetcodeStreak;

// Leetcode no.1980
public class FindUniqueBinaryString {
    static public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            String num = nums[i];
            if (num.charAt(i) == '0') sb.append('1');
            else sb.append('0');
        }
        return sb.toString();
    }

    static void main(String[] args) {
        String[] arr = {"111","011","001"};
        String result = findDifferentBinaryString(arr);
        System.out.println(result);
    }
}

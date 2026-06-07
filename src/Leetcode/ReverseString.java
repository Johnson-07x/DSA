package Leetcode;

import java.util.Arrays;

// Leetcode no.344
public class ReverseString {
    static public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }

    static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
}

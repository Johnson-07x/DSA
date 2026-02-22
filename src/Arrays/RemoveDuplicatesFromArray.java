package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!(n + "").contains(arr[i] + "")) {
                n = (n * 10) + arr[i];
            }
        }
        String num = String.valueOf(n);
        int[] newArr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            newArr[i] = Character.getNumericValue(num.charAt(i));
        }
        System.out.println(Arrays.toString(newArr));
    }
}

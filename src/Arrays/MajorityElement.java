package Arrays;

public class MajorityElement {
    static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int count = 0;
        int num = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                num = arr[i];
                count++;
            }
        }
        System.out.println(num);
    }
}

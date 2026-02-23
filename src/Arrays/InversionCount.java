package Arrays;

public class InversionCount {
    static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

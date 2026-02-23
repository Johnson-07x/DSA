package Arrays;

public class BoyerMooreAlg {
    static void main(String[] args) {
        int[] arr = {2,2,1,1,2,2};
        int count = 0;
        int element = 0;
        for (int e : arr) {
            if (count == 0) {
                element = e;
            }
            if (element == e) {
                count++;
            } else {
                count--;
            }
        }

        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                maxCount++;
            }
        }

        if (maxCount > arr.length / 2) {
            System.out.println(element);
        } else {
            System.out.println("-1");
        }
    }
}

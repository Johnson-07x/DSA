package Arrays;

public class SecondMin {
    static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int e : arr) {
            if (e < firstMin) {
                secondMin = firstMin;
                firstMin = e;
            } else if (e < secondMin && e != firstMin) {
                secondMin = e;
            }
        }
        System.out.println(secondMin);
    }
}

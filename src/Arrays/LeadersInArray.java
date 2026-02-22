package Arrays;

public class LeadersInArray {
    static void main(String[] args) {
        int[] arr = {10, 4, 3, 6, 7, 2};

        int initialLeader = arr[arr.length - 1];
        System.out.println(initialLeader);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > initialLeader) {
                initialLeader = arr[i];
                System.out.println(initialLeader);
            }
        }
    }
}

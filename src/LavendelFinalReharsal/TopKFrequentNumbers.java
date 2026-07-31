package LavendelFinalReharsal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentNumbers {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n , map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );

        pq.addAll(map.entrySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,4,4,6,6,7,8,8,8,8};
        int[] result = topKFrequent(arr, 2);
        System.out.println(Arrays.toString(result));
    }
}

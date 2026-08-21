package Leetcode;

import java.util.PriorityQueue;

// Leetcode no.215
public class kthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) {
            pq.add(n);
            if (pq.size() > k) pq.poll();
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int result = findKthLargest(arr, k);
        System.out.println(result);
    }
}

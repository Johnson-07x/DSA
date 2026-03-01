package SlidingWindow;

public class SubarrayWithKDistinct {
    static int exactlyK(int[] arr, int n, int k) {
        return atMostK(arr, n, k) - atMostK(arr, n, k - 1);
    }

    // Sliding Window: Count subarrays with at most K distinct elements
    static int atMostK(int[] arr, int n, int k) {

        if (k == 0) return 0;

        int[] freq = new int[n + 1];  // because 1 ≤ arr[i] ≤ n
        int left = 0;
        int count = 0;
        int distinct = 0;

        for (int right = 0; right < n; right++) {

            if (freq[arr[right]] == 0)
                distinct++;

            freq[arr[right]]++;

            while (distinct > k) {
                freq[arr[left]]--;

                if (freq[arr[left]] == 0)
                    distinct--;

                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }

    static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int k = 2;
        System.out.println(exactlyK(arr, arr.length, k));
    }
}

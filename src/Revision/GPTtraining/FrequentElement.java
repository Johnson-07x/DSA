package Revision.GPTtraining;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequentElement {
    public static int findFrequentElement(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,1,4,2};
        int result = findFrequentElement(arr);
        System.out.println(result);
    }
}

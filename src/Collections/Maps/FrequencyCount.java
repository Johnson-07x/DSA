package Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    static Map<Integer, Integer> frequencyCount(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i] , 0) + 1);
        }
        return map;
    }

    static void main(String[] args) {
        int[] arr = {1,1,2,3,2,1};
        System.out.println(frequencyCount(arr));
    }
}

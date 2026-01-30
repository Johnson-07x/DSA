package GFG;

import java.util.ArrayList;
import java.util.List;

class GFGproblem {
    static public List<Integer> frequencyCount(int[] arr) {
        // code here
        List<Integer> newList = new ArrayList<>();
        for (int i = 1; i < arr.length + 1; i++){
            int count = 0;
            for (int curr : arr){
                if (curr == i){
                    count++;
                }
            }
            newList.add(count);
        }
        return newList;
    }
    static void main(String[] args) {
        int[] arr = {2, 2, 5, 1, 4};
        System.out.print(frequencyCount(arr));
    }
}

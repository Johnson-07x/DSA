package Leetcode;

// Leetcode no.1722
public class HammingDistance {
    static public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int minSwaps = 0;
        for (int i = 0; i < source.length; i++) {
            int swaps = 0;
            if (source[i] != target[i]) {
                for (int j = 0; j < allowedSwaps.length; j++) {
                    if (source[i] == target[i] || minSwaps < swaps) break;
                    int x = allowedSwaps[j][0];
                    int y = allowedSwaps[j][1];
                    int temp = source[x];
                    source[x] = source[y];
                    source[y] = temp;
                    swaps++;
                }
            }
            minSwaps = Math.min(minSwaps, swaps);
        }

        int count = 0;
        for (int i = 0; i < source.length; i++) {
            if (source[i] != target[i]) count++;
        }

        return count;
    }

    static void main(String[] args) {
        int[] source = {1,2,3,4};
        int[] target = {2,1,4,5};
        int[][] allowedSwaps = {{0,1},{2,3}};

        int result = minimumHammingDistance(source, target, allowedSwaps);
        System.out.println(result);
    }
}

package Leetcode;

interface MountainArray {
    public int get(int index);
    public int length();
}

class MountainArrayImpl implements MountainArray {
    private final int[] arr;
    private int callCount = 0;

    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        callCount++;
        if (callCount > 100) {
            throw new RuntimeException("Limit Exceeded: More than 100 calls to MountainArray.get()");
        }
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }

    public int getCallCount() {
        return callCount;
    }
}

class Solution13 {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        // 1. Find the peak index
        int peak = findPeek(mountainArr, n);

        // 2. Search in the ascending part (0 to peak)
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;

        // 3. Search in the descending part (peak to n-1)
        return binarySearch(mountainArr, target, peak, n - 1, false);
    }

    private int findPeek(MountainArray mountainArr, int n) {
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int binarySearch(MountainArray mountainArr, int target, int left, int right, boolean ascending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = mountainArr.get(mid);

            if (val == target) return mid;

            if (ascending) {
                if (val < target) left = mid + 1;
                else right = mid - 1;
            } else {
                // Descending logic: if value is greater than target, move right
                if (val > target) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}

public class FindInMountainArray {
    public static void main(String[] args) {
        Solution13 s13 = new Solution13();

        int[] data = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        MountainArrayImpl mountain = new MountainArrayImpl(data);
        int result = s13.findInMountainArray(target, mountain);

        System.out.println("Result: " + result); // Expected: 2
        System.out.println("Total API calls made: " + mountain.getCallCount());
    }
}

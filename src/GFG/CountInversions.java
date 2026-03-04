package GFG;

public class CountInversions {
    static int merge(int[] arr, int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for(int i = 0; i < n1; i++){
            leftArr[i] = arr[left+i];
        }

        for(int i = 0; i < n2; i++){
            rightArr[i] = arr[mid+1+i];
        }

        int i = 0, j = 0, k = left;
        int inversions = 0;

        while(i < n1 && j < n2){
            if(leftArr[i]<=rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];

                inversions += (n1 - i);
            }
        }

        while(i < n1){
            arr[k++] = leftArr[i++];
        }

        while(j < n2){
            arr[k++] = rightArr[j++];
        }

        return inversions;
    }

    static int mergeSort(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);

            count += merge(arr, left, mid, right);
        }
        return count;
    }

    static int inversionCount(int arr[]) {
        // Code Here
        int inversionCount = mergeSort(arr, 0, arr.length - 1);
        return inversionCount;
    }

    static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int result = inversionCount(arr);
        System.out.println(result);
    }
}

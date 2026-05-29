package Revision;

public class ExceptionHandling {
    static void divide(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            int result = 0;
            try {
                result = arr1[i] / arr2[i];
                System.out.println("" + arr1[i] + "/" + arr2[i] + "->" + result);
            } catch (Exception e) {
                System.err.println("" + arr1[i] + "/" + arr2[i] + "->" + e.getMessage());
            }
        }
    }
    
    static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {0,1,2,3,0};
        divide(arr1, arr2);
    }
}

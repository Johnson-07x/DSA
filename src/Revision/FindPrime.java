package Revision;

public class FindPrime {
    static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i ++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    static void findPrime(int[] arr) {
        for (int n : arr) {
            if (isPrime(n)) System.out.print(n + " ");
        }
    }

    static void main(String[] args) {
        int[] arr = {16,10,7,17,12,8,2,9};
        findPrime(arr);
    }
}

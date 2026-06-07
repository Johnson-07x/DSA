package Revision.Binary;

public class FindNumericValue {
    static String numToBinary(int n) {
        String result = "";
        while (n != 0) {
            int rem = n % 2;
            result = rem + result;
            n /= 2;
        }

        return result;
    }

    static int binaryToNum(String s) {
        int result = 0;
        int power = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                result += Math.pow(2, power);
            }
            power++;
        }

        return result;
    }

    static void main(String[] args) {
        int n = 11;
        String binary = numToBinary(n);
        int decimal = binaryToNum(binary);
        System.out.println("Binary Number: " + binary);
        System.out.println("Decimal Number: " + decimal);
    }
}

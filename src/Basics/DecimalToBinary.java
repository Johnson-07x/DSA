package Basics;

import java.util.Scanner;

public class DecimalToBinary {
    static int convertToDecimal(String s) {
        int length = s.length();
        int decimal = 0;
        int base = 1;
        for (int i = length - 1; i >= 0; i--) {
//            if (s.charAt(i) == '1') {
//                decimal += base;
//            }
            int lastNum = Integer.parseInt(String.valueOf(s.charAt(i))) * base;
            decimal += lastNum;
            base *= 2;
        }
        return decimal;
    }

    static String convertToBinary(int num) {
        String s = "";
        while (num >= 1) {
            int x = num % 2;
            num /= 2;
            s = x + s;
        }
        System.out.println(convertToDecimal(s));
        return s;
    }

    static void main(String[] args) {
        int n = 8;
        System.out.println(convertToBinary(n));
    }
}

package Leetcode;

// Leetcode no.67
public class AddBinary {
    static public int binaryToDecimal(String num) {
        int decimal = 0;
        int power = 0;

        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }

    static public String decimalToBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num != 0) {
            int rem = num % 2;
            binary.append(rem);
            num /= 2;
        }

        return binary.reverse().toString();
    }

    static public String addBinary(String a, String b) {
        int result = binaryToDecimal(a) + binaryToDecimal(b);

        return decimalToBinary(result);
    }

    static void main(String[] args) {
        String a = "11";
        String b = "1";
        String result = addBinary(a, b);
        System.out.println(result);
    }
}

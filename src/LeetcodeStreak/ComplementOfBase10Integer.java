package LeetcodeStreak;

// Leetcode no.1009
public class ComplementOfBase10Integer {
    static public int bitwiseComplement(int n) {
        String binary = "";
        while (n != 0) {
            int last = n % 2;
            binary = last + binary;
            n /= 2;
        }

        int base = 1;
        int result = 0;
        for (int i = binary.length() - 1; i > 0; i--) {
            int current = 0;
            if (binary.charAt(i) == '0') current = 1;
            result = result + current * base;
            base *= 2;
        }

        return result;
    }

    static void main(String[] args) {
        int n = 2100;
        int result = bitwiseComplement(n);
        System.out.println(result);
    }
}

package Leetcode;

// Leetcode no.858

class Solution8 {
    public int mirrorReflection(int p, int q) {
        while (p % 2 == 0 && q % 2 == 0) {
            p /= 2;
            q /= 2;
        }
        if (p % 2 == 0) {
            return 2;
        } else if (q % 2 != 0) {
            return 1;
        }
        return 0;
    }
}

public class MirrorReflection {
    static void main(String[] args) {
        Solution8 s8 = new Solution8();
        System.out.println(s8.mirrorReflection(3, 2));
    }
}

package Leetcode.LinkedList;

// Leetcode no.202
public class HappyNumberUsingLL {
    static int findSquare(int n) {
        int result = 0;
        while (n > 0) {
            int curr = n % 10;
            result += curr * curr;
            n /= 10;
        }
        return result;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) return true;
        return false;
    }
}

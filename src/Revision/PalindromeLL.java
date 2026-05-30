package Revision;

import java.util.LinkedList;

public class PalindromeLL {
    static boolean checkPalindrome(LinkedList<Integer> ll) {
        for (int i = 0; i < ll.size() / 2; i++) {
            if (!ll.get(i).equals(ll.get(ll.size() - i - 1))) {
                return false;
            }
        }

        return true;
    }

    static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(2);
        ll.add(1);

        System.out.println(checkPalindrome(ll));
    }
}

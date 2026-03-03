package Collections.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StrobogrammaticNumber {
    static boolean findStrobo(int num) {
        Map<Character, Character> m = new HashMap<>();
        m.put('1','1');
        m.put('0','0');
        m.put('8','8');
        m.put('6','9');
        m.put('9','6');
        String s = Integer.toString(num);
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (m.containsKey(s.charAt(left)) && m.containsKey(s.charAt(right))) {
                if (s.charAt(left) != m.get(s.charAt(right))) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }else {
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any num to check it's Strobo: ");
        int num = sc.nextInt();
        System.out.println(findStrobo(num));
    }
}

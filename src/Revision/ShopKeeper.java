package Revision;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

// Shopkeeper starts the day with 0 rupees like the Bus Conductor
// Find he can manage all the customers with the (amt change) he has with all the remaining customers
public class ShopKeeper  {
    static boolean checkValid(Queue<Integer> q) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(30, 0);
        m.put(60, 0);
        m.put(120, 0);

        for (Integer amt : q) {
            m.put(amt, m.get(amt) + 1);

            int rem = amt - 30;
            if (rem == 0) continue;

            if (rem == 30) {
                if (m.get(30) > 0) {
                    m.put(30, m.get(30) - 1);
                } else {
                    return false;
                }
            }

            if (rem == 90) {
                if (m.get(60) >= 1 && m.get(30) >= 1) {
                    m.put(60, m.get(60) - 1);
                    m.put(30, m.get(30) - 1);
                } else if(m.get(30) >= 3) {
                    m.put(30, m.get(30) - 3);
                } else {
                    return false;
                }
            }
        }

        System.out.println(m);
        return true;
    }

    static boolean makeTransaction(Queue<Integer> q) {
        int thirty = 0;
        int sixty = 0;
        int H20 = 0;

        for (Integer amt : q) {
            if (amt == 30) thirty++;
            else if (amt == 60) sixty++;
            else if (amt == 102) H20++;

            int rem = amt - 30;

            if (rem == 0) {
                thirty++;
            }

            if (rem == 30) {
                if (thirty > 0) {
                    thirty--;
                } else return false;
            }

            if (rem == 60) {
                if (sixty >= 1 && thirty >= 1) {
                    sixty--;
                    thirty--;
                } else if (thirty >= 3) {
                    thirty -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    // Both methods do the same process for validating the transaction is possible or not
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
//        q.add(60);
        q.add(30);
        q.add(60);
        q.add(30);
        q.add(60);
//        q.add(120);
        boolean result = checkValid(q);
        System.out.println(result);

        boolean rk_method = makeTransaction(q);
        System.out.println(rk_method);
    }
}

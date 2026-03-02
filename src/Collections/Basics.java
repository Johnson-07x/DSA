package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basics {
    static ArrayList<Integer> findScore() {
        Scanner sc = new Scanner(System.in);
        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();
        System.out.print("Enter no.of categories: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter points for Alice: ");
            int x = sc.nextInt();
            alice.add(x);
            System.out.print("Enter points for Bob: ");
            int y = sc.nextInt();
            bob.add(y);
        }
        System.out.println(alice);
        System.out.println(bob);

        ArrayList<Integer> result = new ArrayList<>();
        int aliceCount = 0;
        int bobCount = 0;
        for (int i = 0; i < size; i++) {
            if (alice.get(i) == bob.get(i)) {
                continue;
            }
            else if (alice.get(i) > bob.get(i)) {
                aliceCount++;
            } else {
                bobCount++;
            }
        }
        result.add(aliceCount);
        result.add(bobCount);
        return result;
    }

    static void main(String[] args) {
        System.out.println(findScore());
    }
}

package Leetcode.Graph;

import java.util.*;

// Leetcode no.841
public class KeysAndRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> q = new LinkedList<>();
        visited[0] = true;
        q.add(0);
        while (!q.isEmpty()) {
            int current = q.poll();
            for (int key : rooms.get(current)) {
                if (!visited[key]) {
                    visited[key] = true;
                    q.add(key);
                }
            }
        }

        for (boolean ans : visited) {
            if (!ans) return false;
        }
        return true;
    }

    static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList() // Represents an empty inner list
        ));

        boolean result = canVisitAllRooms(rooms);
        System.out.println(result);
    }
}

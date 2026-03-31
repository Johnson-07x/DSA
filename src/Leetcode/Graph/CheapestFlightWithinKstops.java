package Leetcode.Graph;

import javax.swing.*;
import java.util.*;

// Leetcode no.787
public class CheapestFlightWithinKstops {
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<int[]>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        int[] distance = new int[n];
        for (int[] flight : flights) {
            graph[flight[0]].add(new int[] {flight[1], flight[2]});

            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[src] = 0;
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[] {src, 0, 0});

            while (!q.isEmpty()) {
                int[] node = q.poll();
                int u = node[0];
                int d = node[1];
                int stop = node[2];
                if (stop > k) {
                    continue;
                }

                for (int[] edge : graph[u]) {
                    int v = edge[0];
                    int w = edge[1];
                    if (distance[v] > d + w) {
                        distance[v] = d + w;
                        q.add(new int[]{v, distance[v], stop + 1});
                    }
                }
            }
        }
        return distance[dst] == Integer.MAX_VALUE ? -1 : distance[dst];
    }

    static void main(String[] args) {
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int result = findCheapestPrice(flights.length, flights, 0, 3, 1);
        System.out.println(result);
    }
}

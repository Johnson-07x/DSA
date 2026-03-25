package Leetcode.Graph.TopologySort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Leetcode no.207
public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            adjList.get(edge[1]).add(edge[0]);
        }

        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int neighbour : adjList.get(i)) {
                indegree[neighbour]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int pollCount = 0;
        while (!q.isEmpty()) {
            int vertex = q.poll();
            pollCount++;
            for (int neighbour : adjList.get(vertex)) {
                indegree[neighbour]--;
                if (indegree[neighbour] == 0) q.add(neighbour);
            }
        }
        return pollCount == numCourses;
    }

    static void main(String[] args) {
        int numCourses = 2;
        int[][] arr = {{1,0}, {0,1}};
        boolean result = canFinish(numCourses, arr);
        System.out.println(result);
    }
}

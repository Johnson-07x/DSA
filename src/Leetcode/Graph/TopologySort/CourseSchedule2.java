package Leetcode.Graph.TopologySort;

import java.util.*;

// Leetcode no.210
public class CourseSchedule2 {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
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

        int[] result = new int[numCourses];
        int index = 0;
        while (!q.isEmpty()) {
            int vertex = q.poll();
            result[index] = vertex;
            index++;
            for (int neighbour : adjList.get(vertex)) {
                indegree[neighbour]--;
                if (indegree[neighbour] == 0) q.add(neighbour);
            }
        }

        if (index == numCourses) return result;

        return new int[] {};
    }

    static void main(String[] args) {
        int[][] arr = {{1,0},{2,0},{3,1},{3,2}};
        int numCourses = 4;
        int[] result = findOrder(numCourses, arr);
        System.out.println(Arrays.toString(result));
    }
}

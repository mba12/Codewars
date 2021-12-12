package com.michaelahern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule2 {

    List<Integer> adj[];
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int inDegree[] = new int[numCourses];
        adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++)
            adj[i] = new ArrayList<>();

        for(int[] edge : prerequisites) {
            inDegree[edge[0]]++;
            adj[edge[1]].add(edge[0]);
        }

        // Create a queue and enqueue
        // all vertices with indegree 0
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0)
                q.add(i);
        }

        // Initialize count of visited vertices
        int cnt = 0;

        // Create a vector to store result
        // (A topological ordering of the vertices)
        List<Integer> topOrder = new ArrayList<>();
        while (!q.isEmpty()) {
            // Extract front of queue
            // (or perform dequeue)
            // and add it to topological order
            int u = q.poll();
            topOrder.add(u);

            // Iterate through all its
            // neighbouring nodes
            // of dequeued node u and
            // decrease their in-degree
            // by 1
            for (int node : adj[u]) {
                // If in-degree becomes zero,
                // add it to queue
                if (--inDegree[node] == 0)
                    q.add(node);
            }
            cnt++;
        }

        // Check if there was a cycle
        if (cnt != numCourses)
            return new int[0];
        else
            return topOrder.stream().mapToInt(Integer::intValue).toArray();

    }
}

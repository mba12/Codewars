package com.michaelahern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    List<Integer> adj[];
    public boolean canFinish(int numCourses, int[][] prerequisites) {

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

        while (!q.isEmpty()) {
            // Extract front of queue
            // (or perform dequeue)
            // and add it to topological order
            int u = q.poll();

            for (int node : adj[u]) {
                // If in-degree becomes zero,
                // add it to queue
                if (--inDegree[node] == 0)
                    q.add(node);
            }
            cnt++;
        }

        return cnt != numCourses;

    }
}

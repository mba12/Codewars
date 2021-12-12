package com.michaelahern;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class MinimumHeightTree {

    Map<String, Integer> depthMap = new HashMap<>();
    Map<Integer, List<Integer>> graph = new HashMap<>();
    PriorityQueue<Integer[]> pq;
    Integer[][] incoming;




    public void initializeGraph(int n, int[][] edges) {
        incoming = new Integer[n][2];

        for(int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for(int[] edge : edges) {
            List<Integer> adjList = graph.get(edge[0]);
            adjList.add(edge[1]);
            graph.put(edge[0], adjList);
            incoming[edge[1]][1]++;

            adjList = graph.get(edge[1]);
            adjList.add(edge[0]);
            graph.put(edge[1], adjList);
            incoming[edge[0]][1]++;
        }

    }

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        List<Integer> answer = new ArrayList<>();

        while(!pq.isEmpty()) {
            Integer[] edge = pq.poll();




        }


        int min = Integer.MAX_VALUE, depth;
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            Integer node = entry.getKey();
            depth = dfs(node, graph, 0);
            if (depth < min) {
                answer.clear();
                answer.add(node);
                min = depth;
            } else if ( depth == min) {
                answer.add(node);
            }
        }

        return answer;
    }

    public int dfs(int node, Map<Integer, List<Integer>> graph, int depth) {

        List<Integer> adjList = graph.get(node);
        if(adjList == null) return depth + 1;

        String key = node + ":" + depth;
        if (depthMap.containsKey(key)) {
            return depthMap.get(key);
        }

        int newDepth = depth + 1, ans;
        int max = Integer.MIN_VALUE;
        for(int edge : adjList) {
            ans = dfs(edge, graph, newDepth);
            max = ans > max ? ans : max;
        }

        depthMap.put(node + ":" + depth, max);
        return max;
    }


}

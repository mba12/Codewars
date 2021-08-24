package com.michaelahern;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class FindItinerary {

    private LinkedList<String> path = new LinkedList<>();
    private Map<String, PriorityQueue<String>> graph = new HashMap<>();

    public List<String> findItinerary(List<List<String>> tickets) {

        for(List<String> city : tickets) {
            PriorityQueue<String> adjList = graph.getOrDefault(city.get(0), new PriorityQueue<>());
            adjList.add(city.get(1));
            graph.put(city.get(0), adjList);
        }
        return getEulerianPath("JFK");
    }

    // Perform DFS to find Eulerian path.
    private void dfs(String from) {
        while (graph.get(from) != null && graph.get(from).size() != 0) {
            PriorityQueue<String> adjNodes = graph.get(from);
            String next = adjNodes.poll();
            dfs(next);
        }
        path.addFirst(from);
    }

    // Returns a list of edgeCount + 1 node ids that give the Eulerian path or
    // null if no path exists or the graph is disconnected.
    public List<String> getEulerianPath(String from) {
        dfs(from);
        return path;
    }
}

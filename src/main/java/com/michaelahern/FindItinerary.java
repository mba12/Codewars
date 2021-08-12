package com.michaelahern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class FindItinerary {

    private int n;
    private Map<String, Integer> in, out;
    private int edgeCount;
    private LinkedList<String> path = new LinkedList<>();
    Map<String, List<String>> graph;

    public List<String> findItinerary(List<List<String>> tickets) {

        graph = new HashMap<>();
        for(List<String> city : tickets) {
            if(graph.containsKey(city.get(0))) {
                List<String> adjList = graph.get(city.get(0));
                adjList.add(city.get(1));
            } else {
                List<String> adjList = new ArrayList<>();
                adjList.add(city.get(1));
                graph.put(city.get(0), adjList);
            }
        }

        n = graph.size();

        getEulerianPath();

    /*
        Map<String, Stack<String>> graph2 = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : graph.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            Collections.sort(value);
            graph.put(key, value);
            Stack<String> stack = new Stack<>();
            for(int i = value.size() - 1; i > -1; i--)
                stack.push(value.get(i));

            graph2.put(key, stack);
        }
        List<String> answer = new ArrayList<>();
        String from = "JFK";
        String to = "";
        answer.add(from);
        do {
            Stack<String> stack = graph2.get(from);
            if(stack != null && !stack.isEmpty()) {
                to = stack.peek();
                if(graph2.containsKey(to)) {

                }

                to = stack.pop();
                answer.add(to);
                if(stack.isEmpty()) graph2.remove(from);
                from = to;
            }
        } while(graph2.size() > 0);


        return answer;
        */

        return null;

    }

    // Returns a list of edgeCount + 1 node ids that give the Eulerian path or
    // null if no path exists or the graph is disconnected.
    public int[] getEulerianPath() {
        setUp();

        dfs("JFK");

        // Make sure all edges of the graph were traversed. It could be the
        // case that the graph is disconnected in which case return null.
        if (path.size() != edgeCount + 1) return null;

        // Instead of returning the 'path' as a linked list return
        // the solution as a primitive array for convenience.
        int[] soln = new int[edgeCount + 1];
       // for (int i = 0; !path.isEmpty(); i++) soln[i] = path.removeFirst();

        return soln;
    }

    private void dfs(String at) {
        /*
        while (out.get(at) != 0) {
            int next = graph.get(at).get(--out[at]); // TODO: figure out what this line does - graph returns a linkedlist
            dfs(next);
        }
        */
        path.addFirst(at);
    }

    private void setUp() {
        // Arrays that track the in degree and out degree of each node.
        in = new HashMap<>();
        out = new HashMap<>();

        edgeCount = 0;

        for (Map.Entry<String, List<String>> entry : graph.entrySet()) {
            String from = entry.getKey();
            List<String> to = entry.getValue();
            out.put(from, to.size());
            edgeCount += to.size();
            for(String s: to) {
                Integer inCount =  in.getOrDefault(s, 0);
                inCount++;
                in.put(s, inCount);
            }
        }
    }
}

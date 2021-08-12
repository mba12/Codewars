package com.michaelahern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Comparator;
import java.util.ArrayDeque;

import com.michaelahern.BulbGrid.Node;

public class Hamiltonian {

    static class Node {
        private int value;
        List<Node> edges = new ArrayList<>();
        Node(int value) { this.value = value; }
        void addEdge(Node node, Set<Integer> sums) {
            if(!sums.contains(value + node.value)) return;
            edges.add(node);
            node.edges.add(this);
        }
        public String toString(){ return String.valueOf(value); }
    }

    static class Path {
        ArrayList<Node> path = new ArrayList<>();
        HashSet<Node> visited = new HashSet<>();
        Node at;
        Path(Node at){
            this.at = at;
            visited.add(at);
            path.add(at);
        }
        Path(Node at, Path from) {
            this(at);
            this.path.addAll(from.path);
            this.visited.addAll(from.visited);
        }
    }

    @org.jetbrains.annotations.Nullable
    public static ArrayList<Node> solve(int n) {
        // Create graph network
        Set<Integer> sums = IntStream.rangeClosed(1, (int) Math.sqrt(n * 2)).boxed()
                .map(i -> i * i).collect(Collectors.toSet());

        Node[] nodes = new Node[n];
        for(int i = 0; i < n; i++) {
            nodes[i] = new Node(i + 1);
            for(int j = 0; j < i; j++)
                nodes[i].addEdge(nodes[j], sums);
        }

        // Sort lists so that we look at best likely next moves
        Arrays.sort(nodes, Comparator.comparingInt(a -> a.edges.size()));
        for(Node node : nodes)
            node.edges.sort((a, b) -> b.edges.size() - a.edges.size());

        // Find path going through entire graph
        ArrayDeque<Path> queue = new ArrayDeque<>();
        for(int i = 0; i < n; i++)
            queue.add(new Path(nodes[i]));
        Path curr;
        while((curr = queue.pollLast()) != null){
            if(curr.path.size() >= n) return curr.path;
            for(Node node : curr.at.edges)
                if(!curr.visited.contains(node))
                    queue.addLast(new Path(node, curr));
        }

        // Failed finding path
        return null;
    }





    // data structure to store graph edges
    class Edge
    {
        int source, dest;

        public Edge(int source, int dest) {
            this.source = source;
            this.dest = dest;
        }
    }

    // class to represent a graph object
    /*
    class Graph
    {
        // A List of Lists to represent an adjacency list
        List<List<Integer>> adjList = null;

        // Constructor
        Graph(List<Edge> edges, int N)
        {
            adjList = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                adjList.add(new ArrayList<>());
            }

            // add edges to the undirected graph
            for (Edge edge: edges)
            {
                int src = edge.source;
                int dest = edge.dest;

                adjList.get(src).add(dest);
                adjList.get(dest).add(src);
            }
        }
    }

        public static void printAllHamiltonianPaths(Map<Integer, Node> g,
                                                    int v,
                                                    boolean[] visited,
                                                    List<Integer> path,
                                                    int V)
        {
            // if all the vertices are visited, then
            // hamiltonian path exists
            if (path.size() == V) {
                // print hamiltonian path
                System.out.println("Final: " + Arrays.toString(path.toArray()));
                return;
            }

            // Check if every edge starting from vertex v leads
            // to a solution or not
            Node nodeV = g.get(v);
            for (Node w : nodeV.getChildren())
            {
                // process only unvisited vertices as hamiltonian
                // path visits each vertex exactly once
                if (!w.getVisited())
                {
                    w.setVisited(true);
                    path.add(w.name);

                    // check if adding vertex w to the path leads
                    // to solution or not
                    printAllHamiltonianPaths(g, w.name, visited, path, V);

                    // Backtrack
                    w.setVisited(false);
                    path.remove(path.size()-1);
                }
            }
        }
        */

/*
        public static void main(String[] args)
        {
            // List of graph edges as per above diagram
            List<Edge> edges = Arrays.asList(
                    new Edge(0, 1), new Edge(0, 2), new Edge(0, 3),
                    new Edge(1, 2), new Edge(1, 3), new Edge(2, 3)
            );

            // Set number of vertices in the graph
            final int N = 4;

            // create a graph from edges
            Graph g = new Graph(edges, N);

            // starting node
            int start = 0;

            // add starting node to the path
            List<Integer> path = new ArrayList<>();
            path.add(start);

            // mark start node as visited
            boolean[] visited = new boolean[N];
            visited[start] = true;

            printAllHamiltonianPaths(g, start, visited, path, N);
        }
    }
*/


}

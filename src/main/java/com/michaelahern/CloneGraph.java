package com.michaelahern;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {

    Map<GraphNode, GraphNode> map = new HashMap<>();
    public GraphNode cloneGraph(GraphNode node) {

        if(node == null) return null;
        GraphNode newRoot = clone(node);

        return newRoot;
    }

    public GraphNode clone(GraphNode node) {

        if(map.containsKey(node)) return map.get(node);

        GraphNode newNode = new GraphNode(node.val);
        map.put(node, newNode);
        for(GraphNode n : node.neighbors) {
            newNode.neighbors.add( clone(n));
        }
        return newNode;
    }


}

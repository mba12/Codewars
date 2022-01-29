package com.michaelahern;

import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
public class MaxDepth {

    int MAX = 0;
    public int maxDepth(Node root) {
        // dfs(root, 1);
        return MAX;
    }
/*  //NOTE: uncomment to run on leetcode which needs a different class definition of Node above
    public void dfs(Node node, int depth) {
        if(node == null) return;

        MAX = depth > MAX?depth:MAX;
        for(Node n : node.children)
            dfs(n, depth + 1);

    }

 */
}

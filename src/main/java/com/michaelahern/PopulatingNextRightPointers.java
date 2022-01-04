package com.michaelahern;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class PopulatingNextRightPointers {

    Map<Integer, Queue> map = new HashMap<>();
    public Node connect(Node root) {
        if(root == null) return root;

        helper(root.left, 1);
        helper(root.right, 1);
        helper2(root.left, 1);
        helper2(root.right, 1);
        return root;
    }


    public void helper(Node node, int depth) {

        if(node == null) return;

        Queue<Node> queue = map.getOrDefault(depth, new LinkedList<>());
        queue.add(node);
        map.put(depth, queue);

        helper(node.left, depth + 1);
        helper(node.right, depth + 1);

    }

    public void helper2(Node node, int depth) {

        if(node == null) return;

        Queue<Node> queue = map.get(depth);
        Node next = queue.poll();
        if(node.equals(next)) next = queue.poll();
        node.next = next;

        helper2(node.left, depth + 1);
        helper2(node.right, depth + 1);

    }
}

package com.michaelahern;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomBinaryTree {

    Map<Node, NodeCopy> map = new HashMap<>();
    public NodeCopy copyRandomBinaryTree(Node root) {
        if(root == null) return null;
        clone(root);
        connectRandoms();
        return map.get(root);
    }

    public NodeCopy clone(Node node) {

        if(node == null) return null;
        NodeCopy copy = new NodeCopy(node.val);
        map.put(node, copy);
        copy.left = clone(node.left);
        copy.right = clone(node.right);

        return copy;
    }

    public void connectRandoms() {

        for (Map.Entry<Node, NodeCopy> entry : map.entrySet()) {
            Node key = entry.getKey();
            NodeCopy value = entry.getValue();
            if(key.random != null) {
                value.random = map.get(key.random);
            }
        }
    }


}

package com.michaelahern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Tree2Array2 {

    Map<Integer, Integer> map = new HashMap<>();

    public Map<Integer, Integer> inorderTraversal(TreeNode root) {

        if(root == null) return map;

        map.put(0, root.val);
        helper(root.left, 1);
        helper(root.right, 2);
        return map;

    }

    private void helper(TreeNode node, int index) {

        if(node == null) {
            map.put(index, null);
            return;
        }
        map.put(index, node.val);
        helper(node.left, index * 2 + 1);
        helper(node.right, index * 2 + 1);
    }

}

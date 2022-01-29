package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class GetLonelyNodes {

    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public void helper(TreeNode node, List<Integer> list) {

        if(node == null) return;

        if(node.right != null && node.left == null) {
            list.add(node.right.val);
        } else if (node.right == null && node.left != null) {
            list.add(node.left.val);
        }
        helper(node.left, list);
        helper(node.right, list);
    }


}

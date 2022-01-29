package com.michaelahern;

import java.util.List;

public class IsUnivalTree {

    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.val) && helper(root.right, root.val);
    }

    private boolean helper(TreeNode node, int val) {

        if(node == null) return true;
        if(node.val == val) {
            return helper(node.left, val) && helper(node.right, val);
        } else {
            return false;
        }
    }

}

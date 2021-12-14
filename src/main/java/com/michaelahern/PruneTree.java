package com.michaelahern;

public class PruneTree {

    public TreeNode pruneTree(TreeNode root) {

        if(root == null) return root;
        if(!containsOne(root)) return null;
        return root;
    }

    public boolean containsOne(TreeNode node) {

        boolean returnVal = false;
        if(node == null) return false;
        if(node.val == 1) returnVal = true;

        boolean left = containsOne(node.left);
        if(!left) node.left = null;
        boolean right = containsOne(node.right);
        if(!right) node.right = null;

        if(returnVal || left || right) return true; else return false;

    }

}

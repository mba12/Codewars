package com.michaelahern;

public class InsertIntoBST {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root == null) {
            root = new TreeNode(val);
        } else if(val < root.val && root.left == null) {
            root.left = new TreeNode(val);
        } else if(val > root.val && root.right == null) {
            root.right = new TreeNode(val);
        } else if(val < root.val) {
            insertIntoBST(root.left, val);
        } else if(val > root.val) {
            insertIntoBST(root.right, val);
        }

        return root;

    }

}

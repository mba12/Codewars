package com.michaelahern;

public class RecoverTree {

    boolean matchFound = false;
    public void recoverTree(TreeNode root) {
        if(!matchFound) checkLeftChildren(root, root.left);
        if(!matchFound) checkRightChildren(root, root.right);
    }

    public void checkLeftChildren(TreeNode root, TreeNode node) {

        if(node == null) return;

        if(node.val > root.val) {
            int temp = node.val;
            node.val = root.val;
            root.val = temp;
            matchFound = true;
            return;
        }

        if(!matchFound) checkLeftChildren(root, node.left);
        if(!matchFound) checkLeftChildren(root, node.right);

        if(!matchFound) checkLeftChildren(node.left, node.left);
        if(!matchFound) checkLeftChildren(node.right, node.right);

    }

    public void checkRightChildren(TreeNode root, TreeNode node) {

        if(node == null) return;

        if(node.val < root.val) {
            int temp = node.val;
            node.val = root.val;
            root.val = temp;
            matchFound = true;
            return;
        }

        if(!matchFound) checkRightChildren(root, node.left);
        if(!matchFound) checkRightChildren(root, node.right);

    }


    public void checkChildren(TreeNode node) {

        if(node == null) return;

        int temp = 0;
        if(node.left != null && node.left.val > node.val) {
            temp = node.val;
            node.val = node.left.val;
            node.left.val = temp;
            checkChildren(node.left);
        }

        if(node.right != null && node.right.val < node.val) {
            temp = node.val;
            node.val = node.right.val;
            node.right.val = temp;
            checkChildren(node.right);
        }

        checkChildren(node.left);
        checkChildren(node.right);
    }

}

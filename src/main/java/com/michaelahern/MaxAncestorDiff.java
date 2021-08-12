package com.michaelahern;

public class MaxAncestorDiff {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    private int rootVal, min, max, diffMax;
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    int maxDiff = 0;
    public int maxAncestorDiff(TreeNode root) {

        if(root.left != null) {
            helper(root.left, root.val, root.val);
        }
        if (root.right != null) {
            helper(root.right, root.val, root.val);
        }
        return maxDiff;
    }

    private void helper(TreeNode node, int min, int max) {
        max = Math.max(max, node.val);
        min = Math.min(min, node.val);
        // System.out.println(node.val + " :: " + min + " :: " + max);
        int diff = Math.abs(max - min);
        maxDiff = Math.max(diff, maxDiff);

        if(node.left != null) {
            helper(node.left, min, max);
        }
        if (node.right != null) {
            helper(node.right, min, max);
        }
    }


}

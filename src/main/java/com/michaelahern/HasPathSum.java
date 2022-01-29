package com.michaelahern;
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
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == targetSum) return true;

        return dfs(root, targetSum, root.val);
    }

    public boolean dfs(TreeNode node, int targetSum, int sum) {

        if(node == null) return false;
        if(node.left == null && node.right == null && targetSum == sum) return true;

        boolean left = false, right = false;

        if(node.left != null)
            left = dfs(node.left, targetSum, sum + node.left.val);

        if(node.right != null)
            right = dfs(node.right, targetSum, sum + node.right.val);

        return  left || right;

    }

}

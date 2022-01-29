package com.michaelahern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
public class PathSumIII {
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {

        if(root == null) return 0;
        dfs(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return count;
    }

    public void dfs(TreeNode node, int targetSum, int sum) {

        if(node == null) return;
        sum += node.val;
        if(targetSum == sum) count++;

        dfs(node.left, targetSum, sum);
        dfs(node.right, targetSum, sum);

    }
}

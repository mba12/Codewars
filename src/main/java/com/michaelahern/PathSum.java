package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

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
public class PathSum {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null) return answer;
        if(root.left == null && root.right == null && root.val == targetSum) {
            List<Integer> row = new ArrayList<>();
            row.add(root.val);
            answer.add(row);
            return answer;
        }
        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        dfs(root, targetSum, root.val, answer, path);
        return answer;
    }

    public void dfs(TreeNode node, int targetSum, int sum, List<List<Integer>> answer, List<Integer> path) {

        if(node == null) return;
        if(node.left == null && node.right == null && targetSum == sum) {
            List<Integer> list = new ArrayList<>(path);
            answer.add(list);
        }

        if(node.left != null) {
            path.add(node.left.val);
            dfs(node.left, targetSum, sum + node.left.val, answer, path);
            path.remove(path.size() - 1);
        }

        if(node.right != null) {
            path.add(node.right.val);
            dfs(node.right, targetSum, sum + node.right.val, answer, path);
            path.remove(path.size() - 1);
        }
    }



}

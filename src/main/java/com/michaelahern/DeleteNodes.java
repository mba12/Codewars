package com.michaelahern;

import java.util.ArrayList;
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
public class DeleteNodes {

    List<TreeNode> answer = new ArrayList<TreeNode>();
    Set<Integer> toDelete = new HashSet<>();
    TreeNode copyT = null;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        copyT = root;
        for(int i : to_delete)
            toDelete.add(i);

        if(root != null) {
            if(!toDelete.contains(root.val)) answer.add(root);
            helper(root, null);
        }

        return answer;
    }

    private void helper(TreeNode node, TreeNode parent) {

        if(node == null) return;

        helper(node.left, parent);
        helper(node.right, parent);

        if(toDelete.contains(node.val)) {
            if(node.right != null && !toDelete.contains(node.right.val))
                answer.add(node.right);

            if(node.left != null && !toDelete.contains(node.left.val))
                answer.add(node.left);

            if(parent != null && parent.right != null && parent.right.val == node.val) {
                parent.right = null;
            } else if(parent != null && parent.left != null && parent.left.val == node.val){
                parent.left = null;
            }
            node = null;
        } else {
            if (node.left != null && toDelete.contains(node.left.val)) {
                node.left = null;
            }
            if (node.right != null && toDelete.contains(node.right.val)) {
                node.right = null;
            }
        }

    }

}

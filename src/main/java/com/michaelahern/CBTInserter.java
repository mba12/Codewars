package com.michaelahern;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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
public class CBTInserter {

    TreeNode root = null;
    Queue<TreeNode> queue = new LinkedList<>();
    public CBTInserter(TreeNode root) {
        this.root = root;
    }

    public int insert(int val) {
        queue.clear();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode parent = queue.poll();

            if(parent.left == null) {
                parent.left = new TreeNode(val);
                return parent.val;
            }
            if(parent.right == null) {
                parent.right = new TreeNode(val);
                return parent.val;
            }

            if(parent.left != null)
                queue.offer(parent.left);
            if(parent.right != null)
                queue.offer(parent.right);
        }

        return -1;
    }

    public TreeNode get_root() {
        return root;
    }



    /*
    Map<TreeNode, Integer> map = new HashMap<>();
    public CBTInserter(TreeNode root) {
        this.root = root;
    }

    public int height(TreeNode node) {
        if(node == null) return 0;

        if(map.containsKey(node)) return map.get(node);
        int h = 1 + Math.max(height(node.left), height(node.right));
        map.put(node, h);
        return h;
    }

    // Get Balance factor of node N
    int getBalance(TreeNode node) {
        if (node == null)
            return 0;

        return height(node.left) - height(node.right);
    }

    public int insert(int val) {
        int returnVal = 0;
        if(root == null) {
            root = new TreeNode(val);
            returnVal = val;
        } else {
            TreeNode parent = insert(root, val);
            returnVal = parent.val;
        }

        return returnVal;
    }

    TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;
        TreeNode T2 = x.right;

        // perform rotation
        x.right = y;
        y.left = T2;
        return x;
    }

    TreeNode leftRotate(TreeNode x) {
        TreeNode y = x.right;
        TreeNode T2 = y.left;
        // perform rotation
        y.left = x;
        x.right = T2;
        return y;
    }

    public TreeNode insert(TreeNode node, int val) {

        if(node == null) {
            return new TreeNode(val);
        }

        if(val < node.val) {
            if(node.left == null) {
                node.left = new TreeNode(val);
            }
            insert(node.left, val);
        } else {
            if(node.right == null) {
                node.right = new TreeNode(val);
            }
            insert(node.right, val);
        }

        map = new HashMap<>();
        int height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Left Left case
        if(balance > 1 && val < node.left.val) {
            return rightRotate(node);
        }

        // Right Right case
        if(balance < -1 && val > node.right.val) {
            return leftRotate(node);
        }

        // Left Right case
        if(balance > 1 && val > node.left.val) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left case
        if(balance < -1 && val < node.right.val) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public TreeNode get_root() {
        return this.root;
    }

     */

}

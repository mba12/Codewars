package com.michaelahern;

public class SumNumbers {
    int total = 0;
    public int sumNumbers(TreeNode root) {

        if(root.left == null && root.right == null) return root.val;

        helper(root.right, root.val);
        helper(root.left, root.val);

        return total;
    }

    public void helper(TreeNode node, int partialTotal) {

        if(node == null) {
            return;
        }

        int currentTotal = partialTotal * 10 + node.val; // 40
        if(node.left == null && node.right == null) {
            total += currentTotal;
        } else {
            if(node.right != null && node.left != null) {
                helper(node.left, currentTotal);
                helper(node.right, currentTotal);
            } else if(node.right == null) {
                helper(node.left, currentTotal);
            } else if(node.left == null)
                helper(node.right, currentTotal);
        }

    }
}

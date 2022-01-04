package com.michaelahern;

public class MergeTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if(root1 != null && root2 != null) {
            root1.val += root2.val;
            helper(root1, root2);
            return root1;
        } else if(root1 != null && root2 == null)
            return root1;
        else if(root1 == null && root2 != null)
            return root2;

        return null;
    }

    public void helper(TreeNode node1, TreeNode node2 ) {

        if(node1 == null && node2 == null)
            return;

        if(node1 != null && node2 != null) {
            if(node1.left != null && node2.left != null)
                node1.left.val += node2.left.val;
            else if (node1.left == null && node2.left != null )
                node1.left = new TreeNode(node2.left.val);

            if(node1.right != null && node2.right != null)
                node1.right.val += node2.right.val;
            else if (node1.right == null && node2.right != null )
                node1.right = new TreeNode(node2.right.val);
        }

        if(node2.left != null) helper(node1.left, node2.left);
        if(node2.right != null) helper(node1.right, node2.right);

    }
}

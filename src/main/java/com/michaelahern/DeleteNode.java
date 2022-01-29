package com.michaelahern;

public class DeleteNode {

    public TreeNode deleteNode(TreeNode root, int key) {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;

        /* Otherwise, recur down the tree */
        if (key < root.val)
            root.left = deleteNode(root.left, key);
        else if (key > root.val)
            root.right = deleteNode(root.right, key);
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.val = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.val);
        }

        return root;
    }

    int minValue(TreeNode node)
    {
        int minv = node.val;
        while (node.left != null)
        {
            minv = node.left.val;
            node = node.left;
        }
        return minv;
    }


}

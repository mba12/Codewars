package com.michaelahern;

public class ArrayToTree {

    public ArrayToTree() {
    }

    public TreeNode createTreeNode(int val) {
        return new TreeNode(val);
    }

    TreeNode nodeAndChildren(int val, TreeNode left, TreeNode right) {
        TreeNode node = new TreeNode(val);
        node.left = left;
        node.right = right;
        return node;
    }

    public TreeNode arrayToTree(int array[]) {
        return arrayToTree(array, 0);
    }

    TreeNode arrayToTree(int array[], int index) {
        if (index >= array.length)
            return null;
        if (array[index] == Integer.MAX_VALUE)
            return null;
        return new TreeNode(array[index], arrayToTree(array, index * 2 + 1), arrayToTree(array, index * 2 + 2));
    }
}

package com.michaelahern;

public class BST2Array {

    public int [] toBSTArray(TreeNode root) {
        int size = 20; //ASSUMING THIS IS LESS THAN OR EQUAL TO NUMBER OF NODES IN THE TREE
        int [] BSTarray = new int [size];
        makeArray(root, 0, BSTarray);
        return BSTarray;
    }

    //helper method called by toBSTArray
    public void makeArray(TreeNode node, int i, int [] BSTarray ) {
        if (node != null) {
            BSTarray[i] = node.val;
            makeArray(node.left, 2*i+1, BSTarray);
            makeArray(node.right, 2*i+2, BSTarray);
        }
    }
}

package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();

        if(root == null) return list;
        helper(list, root.left);
        helper(list, root.right);
        list.add(root.val);
        return list;

    }

    private void helper(List<Integer> list, TreeNode node) {

        if(node == null) return;
        helper(list, node.left);
        helper(list, node.right);
        list.add(node.val);

    }

}

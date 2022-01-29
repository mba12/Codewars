package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();

        if(root == null) return list;

        helper(list, root.left);
        list.add(root.val);
        helper(list, root.right);
        return list;

    }

    private void helper(List<Integer> list, TreeNode node) {

        if(node == null) return;
        helper(list, node.left);
        list.add(node.val);
        helper(list, node.right);

    }

}

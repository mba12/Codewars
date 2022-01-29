package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();

        if(root == null) return list;

        list.add(root.val);
        helper(list, root.left);
        helper(list, root.right);
        return list;

    }

    private void helper(List<Integer> list, TreeNode node) {

        if(node == null) return;

        list.add(node.val);
        helper(list, node.left);
        helper(list, node.right);

    }

}

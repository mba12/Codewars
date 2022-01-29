package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class Tree2Str {

    public String tree2str(TreeNode root) {
        StringBuilder str = new StringBuilder();

        if(root == null) return  str.toString();

        str.append(root.val);
        helper(str, root.left, root.left == null && root.right != null);
        helper(str, root.right, false);

        return str.toString();
    }

    private void helper(StringBuilder str, TreeNode node, boolean flag) {

        if(node == null) {
            if(flag) str.append("()");
            return;
        }

        str.append("(");
        str.append(node.val);
        helper(str, node.left, node.left == null && node.right != null);
        helper(str, node.right, false);
        str.append(")");
    }
}

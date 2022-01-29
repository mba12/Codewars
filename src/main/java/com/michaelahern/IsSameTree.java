package com.michaelahern;

import java.util.List;

public class IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return helper(p, q);
    }

    private boolean helper(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;

        if(p != null && q != null && p.val == q.val) {
            return helper(p.left, q.left) && helper(p.right, q.right);
        }
        return false;

    }





}

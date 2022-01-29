package com.michaelahern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetMinimumDifference {

    public int getMinimumDifference(TreeNode root) {

        List<Integer> list = new ArrayList();

        if(root == null) return 0;

        helper(list, root.left);
        list.add(root.val);
        helper(list, root.right);

        Collections.sort(list);
        int minDiff = Integer.MAX_VALUE;
        int diff;
        for(int i = 1; i < list.size(); i++) {
            diff = list.get(i) - list.get(i - 1);
            minDiff = diff < minDiff? diff : minDiff;
        }

        return minDiff;

    }

    private void helper(List<Integer> list, TreeNode node) {
        if(node == null) return;
        helper(list, node.left);
        list.add(node.val);
        helper(list, node.right);
    }
}

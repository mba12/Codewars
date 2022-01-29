package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeaf {

    public int sumRootToLeaf(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null) return 0;
        if(root.left == null && root.right == null) {
            return 0;
        }
        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        dfs(root, answer, path);
        int total = 0;

        return getTotal(answer);
    }

    public int getTotal(List<List<Integer>> answer) {
        int total = 0, subTotal = 0, idx = 0;
        for(List<Integer> number : answer) {
            subTotal = 0; idx = 0;
            for(int i = number.size() - 1; i > -1; i--) {
                subTotal += number.get(i) * (int) Math.pow(2, idx);
            }
            total += subTotal;
        }
        return total;
    }

    public void dfs(TreeNode node, List<List<Integer>> answer, List<Integer> path) {

        if(node == null) return;
        if(node.left == null && node.right == null) {
            List<Integer> list = new ArrayList<>(path);
            answer.add(list);
        }

        if(node.left != null) {
            path.add(node.left.val);
            dfs(node.left, answer, path);
            path.remove(path.size() - 1);
        }

        if(node.right != null) {
            path.add(node.right.val);
            dfs(node.right, answer, path);
            path.remove(path.size() - 1);
        }
    }

}

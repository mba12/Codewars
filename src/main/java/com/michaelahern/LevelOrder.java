package com.michaelahern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LevelOrder {

    Map<Integer, List<Integer>> map = new HashMap<>();
    int MAX = 0;
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();

        if(root == null) return answer;
        inOrder(root, 0);
        for(int i = 0; i <= MAX; i++) {
            List<Integer> row = map.get(i);
            answer.add(row);
        }

        return answer;
    }

    public void inOrder(TreeNode node, int depth) {

        if(node == null) return;

        if(depth > MAX) MAX = depth;
        inOrder(node.left, depth + 1);
        List<Integer> level = map.getOrDefault(depth, new ArrayList<>());
        level.add(node.val);
        map.put(depth, level);
        inOrder(node.right, depth + 1);

    }

}

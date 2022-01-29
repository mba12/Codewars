package com.michaelahern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZigZagLevelOrder {

    Map<Integer, List<Integer>> map = new HashMap<>();
    int MAX = 0;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();

        if(root == null) return answer;
        inOrder(root, 0);
        for(int i = 0; i <= MAX; i++) {
            List<Integer> row = map.get(i);
            if(i % 2 == 1)
                answer.add(reverseArrayList(row));
            else
                answer.add(row);
        }

        return answer;
    }

    public List<Integer> reverseArrayList(List<Integer> alist)
    {
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {
            revArrayList.add(alist.get(i));
        }
        return revArrayList;
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

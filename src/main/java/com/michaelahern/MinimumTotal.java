package com.michaelahern;

import java.util.List;

public class MinimumTotal {

    public int minimumTotal(List<List<Integer>> triangle) {

        int rows = triangle.size();
        if(rows == 1) return triangle.get(0).get(0);

        List<Integer> lastRow = triangle.get(triangle.size() - 1);
        int cols = lastRow.size();

        int[][] memo = new int[rows][cols];
        for(int i = 0; i < cols; i++)
            memo[rows - 1][i] = lastRow.get(i);

        helper(triangle, rows - 2, memo);
        return memo[0][0];
    }

    public void helper(List<List<Integer>> triangle, int depth, int[][] memo) {

        if(depth < 0 ) {
            return;
        }
        int cols = triangle.get(depth).size();
        for(int i = 0; i < cols; i++)
            memo[depth][i] = triangle.get(depth).get(i) + Math.min( memo[depth+1][i], memo[depth+1][i + 1]);

        helper(triangle, depth - 1, memo);

    }

}

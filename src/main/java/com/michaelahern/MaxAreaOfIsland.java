package com.michaelahern;

public class MaxAreaOfIsland {

    int[] NORTH = {0,1};
    int[] SOUTH = {0,-1};
    int[] WEST = {-1, 0};
    int[] EAST = {1, 0};
    int[][] directions = {WEST, NORTH, EAST, SOUTH};

    public int maxAreaOfIsland(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        int maxArea = 0, area;
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                area = 0;
                if(!visited[row][col] && grid[row][col] == 1) {
                    area = 1 + dfs(grid, visited, row, col);
                    if(area > maxArea) maxArea = area;
                }
                visited[row][col] = true;
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, boolean[][] visited, int i, int j) {

        int total = 0;
        for(int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            if(x > -1 && x < grid.length && y > -1 && y < grid[x].length && !visited[x][y]) {
                total += grid[x][y];
                visited[x][y] = true;
                if(grid[x][y] == 1) total += dfs(grid, visited, x, y);
            }
        }

        return total;
    }



}

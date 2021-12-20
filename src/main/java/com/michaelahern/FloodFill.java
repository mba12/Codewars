package com.michaelahern;

public class FloodFill {

    int[][] directions = new int[4][2];
    int masterColor = 0;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        directions[0] = new int[]{0, 1};  // east
        directions[1] = new int[]{1, 0}; // south
        directions[2] = new int[]{0, -1}; // west
        directions[3] = new int[]{-1, 0};  // north
        masterColor = image[sr][sc];
        boolean[][] visited = new boolean[image.length][image[0].length];
        dfs(image, sr, sc, newColor, visited);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int newColor, boolean[][] visited) {

        if(visited[sr][sc]) return;
        visited[sr][sc] = true;
        if(image[sr][sc] != masterColor) {
            return;
        }
        image[sr][sc] = newColor;

        int row, col;
        for (int[] direction : directions) {
            row = sr + direction[0];
            col = sc + direction[1];
            if (row < 0 || col < 0 || row >= image.length || col >= image[0].length) {
                continue;
            }

            if (!visited[row][col]) {
                dfs(image, row, col, newColor, visited);
            }
        }
    }
 }
package com.michaelahern;

import java.util.LinkedList;
import java.util.Queue;

public class UpdateMatrix {
    private final int EAST = 0;
    private final int SOUTH = 1;
    private final int WEST = 2;
    private final int NORTH = 3;
    int[][] directions = new int[4][2];

    Queue<Integer[]> queue = new LinkedList<>();
    boolean[][] visited;

    public int[][] updateMatrix(int[][] mat) {
        directions[EAST] = new int[]{0, 1};  // east
        directions[SOUTH] = new int[]{1, 0}; // south
        directions[WEST] = new int[]{0, -1}; // west
        directions[NORTH] = new int[]{-1, 0};  // north
        visited = new boolean[mat.length][mat[0].length];
        addZerosToQueue(mat);
        bfs(mat);

        return mat;
    }

    public void addZerosToQueue(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 0) {
                    Integer[] cell = new Integer[2];
                    cell[0] = i; cell[1] = j;
                    queue.add(cell);
                }
            }
        }
    }

    public void bfs(int[][] mat) {

        int distance = 0;
        while(!queue.isEmpty()) {

            int size = queue.size();
            distance++;

            while (size > 0) {
                Integer[] cell = queue.remove();
                if (visited[cell[0]][cell[1]]) continue;
                visited[cell[0]][cell[1]] = true;

                for (int[] direction : directions) {
                    int x = cell[0] + direction[0];
                    int y = cell[1] + direction[1];
                    if (x > -1 && x < mat.length && y > -1 && y < mat[0].length && !visited[x][y]) {
                        Integer[] newCell = new Integer[2];
                        newCell[0] = x;
                        newCell[1] = y;
                        mat[x][y] = distance;
                        queue.add(newCell);
                    }
                }
                size--;
            }
        }
    }
}

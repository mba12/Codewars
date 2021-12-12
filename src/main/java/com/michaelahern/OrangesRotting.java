package com.michaelahern;

import java.util.HashSet;
import java.util.Set;

public class OrangesRotting {
    int[][] directions = {{0,1}, {0, -1}, {1, 0}, {-1, 0}};

    public int orangesRotting(int[][] grid) {

        Set<Integer[]> rottenList = new HashSet<>();
        Set<Integer[]> goodList = new HashSet<>();

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                Integer[] apple = new Integer[2];
                apple[0] = i; apple[1] = j;
                if(grid[i][j] == 1) {
                    if(checkNeighbors(i, j, grid)) {
                        return -1;
                    }
                    goodList.add(apple);
                } else if (grid[i][j] == 2) {
                    rottenList.add(apple);
                }
            }
        }
        if(rottenList.size() == 0) return -1;

        int days = 0;
        while(goodList.size() > 0) {
            days++;
            for(Integer[] apple : rottenList) {
                updateNeighbors(apple[0], apple[1], grid, rottenList, goodList);
            }



        }

        return 0;
    }

    public void updateNeighbors(int i, int j, int[][] grid,
                                   Set<Integer[]> rottenList, Set<Integer[]> goodList) {

        for(int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            if(x > -1 && x < grid.length && y > -1 && y < grid[x].length) {
                Integer[] apple = new Integer[2];
                apple[0] = i; apple[1] = j;
                if(goodList.contains(apple)) {
                    rottenList.add(apple);
                    goodList.remove(apple);
                }
            }
        }
    }

    public boolean checkNeighbors(int i, int j, int[][] grid) {
        int total = 0;
        for(int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            if(x > -1 && x < grid.length && y > -1 && y < grid[x].length)
                total += grid[x][y];
        }
        return total == 0;
    }
}

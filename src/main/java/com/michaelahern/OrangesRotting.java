package com.michaelahern;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OrangesRotting {
    int[][] directions = {{0,1}, {0, -1}, {1, 0}, {-1, 0}};
    Set<Apple> moveList = new HashSet<>();
    boolean[][] visited, queueVisit;
    public int orangesRotting(int[][] grid) {

        Set<Apple> rottenList = new HashSet<>();
        Set<Apple> goodList = new HashSet<>();
        visited = new boolean[grid.length][grid[0].length];
        queueVisit = new boolean[grid.length][grid[0].length];

        int totalApples = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    totalApples++;
                    goodList.add(new Apple(i, j));
                } else if (grid[i][j] == 2) {
                    rottenList.add(new Apple(i, j));
                    totalApples++;
                }
            }
        }
        if(goodList.size() == 0) return 0;
        if(rottenList.size() == 0) return -1;
        if(totalApples != checkForIslands(grid, rottenList)) return -1;

        int days = 0;
        while(goodList.size() > 0 && rottenList.size() > 0) {
            days++; moveList.clear();
            for(Apple apple : rottenList) {
                moveList = updateNeighbors(apple, grid);
            }
            updateRotten(grid, goodList, rottenList);
        }
        return days;
    }

    public int checkForIslands(int[][] grid, Set<Apple> rottenList) {

        int x, y, total = 0;
        for(Apple apple : rottenList) {
            Queue<Apple> queueA = new LinkedList<>();
            if(!queueVisit[apple.x][apple.y])
                queueA.add(apple);
            else
                continue;

            while(!queueA.isEmpty()) {
                Apple a = queueA.remove();
                total++;
                queueVisit[a.x][a.y] = true;
                for(int[] direction : directions) {
                    x = a.x + direction[0];
                    y = a.y + direction[1];
                    if(x > -1 && x < grid.length && y > -1 && y < grid[x].length && !queueVisit[x][y]) {
                        queueVisit[x][y] = true;
                        if(grid[x][y] != 0) {
                            queueA.add(new Apple(x, y));
                        }
                    }
                }
            }
        }
        return total;
    }

    public void updateRotten(int[][] grid, Set<Apple> goodList, Set<Apple> rottenList) {

        rottenList.clear();
        for(Apple apple : moveList) {
            goodList.remove(apple);
            rottenList.add(apple);
            grid[apple.x][apple.y] = 2;
        }

    }

    public Set<Apple> updateNeighbors(Apple apple, int[][] grid) {

        int x, y;
        for(int[] direction : directions) {
            x = apple.x + direction[0];
            y = apple.y + direction[1];
            if(x > -1 && x < grid.length && y > -1 && y < grid[x].length && !visited[x][y] && grid[x][y] == 1) {
                moveList.add(new Apple(x, y));
                visited[x][y] = true;
            }
        }
        return moveList;
    }

    public class Apple {
        public int x;
        public int y;

        public Apple(int i, int j) {
            this.x = i;
            this.y = j;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof Apple))
                return false;
            Apple other = (Apple) o;
            return this.x == other.x && this.y == other.y;
        }

        @Override
        public final int hashCode() {
            String code = x + "" + y;
            return code.hashCode();
        }

    }
}

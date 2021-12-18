package com.michaelahern;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PacificAtlantic {

    private static final int EAST = 0;
    private static final int SOUTH = 1;
    private static final int WEST = 2;
    private static final int NORTH = 3;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int[][] directions = new int[4][2];
        directions[EAST] = new int[]{0, 1};  // east
        directions[SOUTH] = new int[]{1, 0}; // south
        directions[WEST] = new int[]{0, -1}; // west
        directions[NORTH] = new int[]{-1, 0};  // north

        int southBoarder = heights.length - 1;
        int eastBoarder = heights[0].length - 1;
        int[][] marker = new int[heights.length][heights[0].length];
        boolean[][] visited = new boolean[heights.length][heights[0].length];
        List<List<Integer>> answer = new ArrayList<>();

        // mark the corners  -1 - pacific 1 - atlantic 2 - both   0 -untouched
        marker[0][0] = -1;
        marker[southBoarder][eastBoarder] = 1;
        marker[southBoarder][0] = 2;
        marker[0][eastBoarder] = 2;
        addToAnswer( southBoarder, 0, answer);
        addToAnswer(  0, eastBoarder, answer);

        //visited[southBoarder][0] = true;
        //visited[0][eastBoarder] = true;

        for (int i = 1; i < eastBoarder; i++) {
            marker[0][i] = -1;
            marker[southBoarder][i] = 1;
        }

        for (int i = 1; i < southBoarder; i++) {
            marker[i][0] = -1;
            marker[i][eastBoarder] = 1;
        }

        int row = 1, col = 1;

        PriorityQueue<Integer[]> queue = new PriorityQueue<>((node1, node2) -> node1[2] - node2[2]);
        Integer[] cell;
        if(heights.length > 1) {
            Integer[] cell3 = {0, eastBoarder, heights[0][eastBoarder]};
            Integer[] cell4 = {southBoarder, 0, heights[southBoarder][0]};
            queue.add(cell3);
            queue.add(cell4);
        } else {
            Integer[] cell5 = {0, 0};
            queue.add(cell5);
        }

        int borderCount;
        while (!queue.isEmpty()) {

            cell = queue.remove();

            if (visited[cell[0]][cell[1]]) {
                continue;
            }

            borderCount = 0;
            for (int[] direction : directions) {
                row = cell[0] + direction[0];
                col = cell[1] + direction[1];
                if (row < 0 || col < 0 || row >= heights.length || col >= heights[0].length) {
                    borderCount++;
                    continue;
                }

                if(!visited[row][col]) {
                    Integer[] neighbor = {row, col, heights[row][col]};
                    queue.add(neighbor);
                }

                if (heights[cell[0]][cell[1]] >= heights[row][col]) {
                    if (marker[row][col] == 2) {
                        marker[cell[0]][cell[1]] = 2;
                        addToAnswer( cell[0], cell[1], answer);
                        visited[cell[0]][cell[1]] = true;
                    } else if (marker[row][col] == 0) {
                        queue.add(cell);
                    } else {
                        if (marker[cell[0]][cell[1]] == 2) {
                            visited[cell[0]][cell[1]] = true;
                        } else if (marker[cell[0]][cell[1]] == -marker[row][col]) {
                            marker[cell[0]][cell[1]] = 2;
                            addToAnswer( cell[0], cell[1], answer);
                            visited[cell[0]][cell[1]] = true;
                        } else if (marker[cell[0]][cell[1]] == 0) {
                            marker[cell[0]][cell[1]] = marker[row][col];
                            borderCount++;
                        } else if (marker[cell[0]][cell[1]] == marker[row][col]) {
                            borderCount++;
                        }
                    }
                } else {
                    borderCount++;
                }

            }
            if (borderCount == 4)
                visited[cell[0]][cell[1]] = true;
        }

        return answer;
    }

    public void addToAnswer(int i, int j, List<List<Integer>> answer) {
        List<Integer> high = new ArrayList(2);
        high.add(i);
        high.add(j);
        if(!answer.contains(high))
            answer.add(high);
    }

}

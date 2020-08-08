package com.michaelahern;

public class Snail {

    private static final int EAST = 0;
    private static final int SOUTH = 1;
    private static final int WEST = 2;
    private static final int NORTH = 3;

    public static int[] snail(int[][] array) {

        if(array.length == 1 && array[0].length == 0) return new int[0];

        int[][] direction = new int[4][2];
        direction[EAST] = new int[]{0, 1};  // east
        direction[SOUTH] = new int[]{1, 0}; // south
        direction[WEST] = new int[]{0, -1}; // west
        direction[NORTH] = new int[]{-1, 0};  // north

        int[][] marked = new int[array.length][array[0].length];
        int[] answer = new int[array.length * array[0].length];

        int row = 0, col = 0, travel = EAST, count = 1;
        marked[0][0] = 1; answer[0] = array[0][0];
        while(count < answer.length) {

            if(   (travel == EAST &&  (col + 1 == array[row].length || marked[row][col + 1] == 1))
               || (travel == WEST  && (col - 1 < 0  || marked[row][col - 1] == 1))
               || (travel == SOUTH && (row + 1 == array.length || marked[row + 1][col] == 1))
               || (travel == NORTH && (row - 1 < 0 || marked[row - 1][col] == 1))  ) {
                travel = (travel + 1) % 4;
            }
            row += direction[travel][0];
            col += direction[travel][1];

            answer[count] = array[row][col];
            marked[row][col] = 1;
            count++;
        }

        return answer;
    }
}

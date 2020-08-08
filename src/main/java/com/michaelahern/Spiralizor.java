package com.michaelahern;

public class Spiralizor {

    private static final int EAST = 0;
    private static final int SOUTH = 1;
    private static final int WEST = 2;
    private static final int NORTH = 3;

    public static int[][] spiralize(int size) {

        int[][] direction = new int[4][2];
        direction[EAST] = new int[]{0, 1};  // east
        direction[SOUTH] = new int[]{1, 0}; // south
        direction[WEST] = new int[]{0, -1}; // west
        direction[NORTH] = new int[]{-1, 0};  // north
        boolean end = false;

        int[][] matrix = new int[size][size];
        int row = 0, col = 0, travel = EAST;
        int middleRow = size / 2;

        matrix[row][col] = 1;
        int count = 0;
        while(!(row == middleRow && col == middleRow)) {

            // external walls
            if((travel == EAST && col + 1 == size) ||  (travel == WEST  && col == 0) ||
               (travel == SOUTH && row + 1 == size) || (travel == NORTH && row - 2 == 0)) {
                travel = (travel + 1) % 4;
            } else if (travel == EAST && col < size - 2) {
                if (matrix[row][col + 2] == 1)
                    travel = (travel + 1) % 4;
            } else if (travel == WEST && col > 1) {
                if (matrix[row][col - 2] == 1)
                    travel = (travel + 1) % 4;
            } else if (travel == NORTH && row > 1) {
                if (matrix[row-2][col] == 1)
                    travel = (travel + 1) % 4;
            } else if (travel == SOUTH && row > 1 && row < size - 2) {
                if (matrix[row+2][col] == 1)
                    travel = (travel + 1) % 4;
            }
            col += direction[travel][1];
            row += direction[travel][0];
            matrix[row][col] = 1;

            if(row > 0 && row < size - 1 && col > 0 && col < size - 1) {
                switch (travel) {
                    case NORTH:
                        if(matrix[row-1][col] == 1) end = true;
                        break;
                    case SOUTH:
                        if(matrix[row+1][col] == 1) end = true;
                        break;
                    case WEST:
                        if(matrix[row][col-1] == 1) end = true;
                        break;
                    case EAST:
                        if(matrix[row][col+1] == 1) end = true;
                        break;
                }

                if (travel == EAST || travel == WEST) {
                    if(matrix[row+1][col] == 1 || matrix[row-1][col] == 1) {
                        end = true;
                    }
                } else if(travel == NORTH || travel == SOUTH) {
                    if(matrix[row][col + 1] == 1 || matrix[row][col - 1] == 1) {
                        end = true;
                    }
                }
            }

            if(end) {
                matrix[row][col] = 0; break;
            }

        }
        return matrix;
    }


}

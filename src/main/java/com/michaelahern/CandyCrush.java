package com.michaelahern;

public class CandyCrush {

    public int[][] candyCrush(int[][] board) {
        boolean flag;

        int[][] zeroes = new int[board.length][board[0].length];

        do {
            flag = false;
            for(int i = 0; i < board.length; i++) {
                for(int j = 0; j < board[0].length; j++) {
                    if(board[i][j] != 0 && j < board[0].length - 1 && board[i][j] == board[i][j + 1]) {
                        flag = horizontalMatch(zeroes, board, i, j) || flag;
                    }

                    if(board[i][j] != 0 && i < board.length - 1 && board[i][j] == board[i + 1][j]) {
                        flag = verticalMatch(zeroes, board, i, j) || flag;
                    }
                }
            }

            if(flag) {
                adjustBoard(zeroes, board);
            }

        } while(flag);

        return board;
    }

    public void adjustBoard(int[][] zeroes, int[][] board) {
        int count;
        for(int column = 0; column < board[0].length; column++) {
            count = 0;
            for(int row = board.length - 1; row > -1; row--) {
                if(zeroes[row][column] == 1) {
                    count++;
                    zeroes[row][column] = 0;
                } else if(count > 0) {
                    board[row + count][column] = board[row][column];
                }
            }
            if(count > 0) {
                for(int row = 0; row < count; row++)
                    board[row][column] = 0;
            }
        }

    }

    public boolean horizontalMatch(int[][] zeros, int[][] board, int i, int row) {
        int totalSize = 0;
        for(int j = row; j < board[0].length - 1; j++) {
            if(board[i][j] != 0 && board[i][j] == board[i][j + 1]) {
                totalSize++;
            }
            if(board[i][j] != board[i][j + 1]) break;
        }

        if(totalSize >= 2) {
            for(int j = row; j < row + totalSize + 1; j++) {
                zeros[i][j] = 1;
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean verticalMatch(int[][] zeros, int[][] board, int column, int row) {
        int totalSize = 0;
        for(int i = column; i < board.length - 1; i++) {
            if(board[i][row] != 0 && board[i][row] == board[i + 1][row]) {
                totalSize++;
            }
            if(board[i][row] != board[i + 1][row]) break;
        }

        if(totalSize >= 2) {
            for(int i = column; i < column + totalSize + 1; i++) {
                zeros[i][row] = 1;
            }
            return true;
        } else {
            return false;
        }
    }
}

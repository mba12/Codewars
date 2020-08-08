package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {


    public String longestCommonSubsequence(String x, String y) {
        x = " " + x;
        y = " " + y;
        int lenA = x.length();
        int lenB = y.length();
        char[] charA = x.toCharArray();
        char[] charB = y.toCharArray();

        int[][] matrix = new int[lenB][lenA];

        for(int row = 1; row < matrix.length; row++) {
            for(int col = 1; col < matrix[0].length; col++ ) {

                if(charB[row] == charA[col]) {
                    matrix[row][col] = 1 + matrix[row-1][col-1];
                } else {
                    matrix[row][col] = matrix[row-1][col] > matrix[row][col-1] ? matrix[row-1][col] : matrix[row][col-1];
                }
            }
        }
        List<Character> answer = new ArrayList<>();
        int length = matrix[lenB-1][lenA-1];

        int currentValue = matrix[lenB-1][lenA-1];
        int checkRow = lenB - 1;
        int checkCol = lenA - 1;

        while(currentValue > 0) {
            while(matrix[checkRow][checkCol] >= currentValue) {
                checkRow--;
            }
            checkRow++;

            while(matrix[checkRow][checkCol] >= currentValue) {
                checkCol--;
            }
            checkCol++;

            if(x.charAt(checkCol) == y.charAt(checkRow))
                answer.add(x.charAt(checkCol));

            currentValue--;
        }

        StringBuilder str = new StringBuilder();
        for(Character c : answer)
            str.append(c);

        return str.reverse().toString();
    }





}

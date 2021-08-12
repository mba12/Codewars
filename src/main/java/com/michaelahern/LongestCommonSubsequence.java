package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {


    public String lcs(String a, String b) {
        a = " " + a;
        b = " " + b;
        int lenA = a.length();
        int lenB = b.length();
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

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

            if(a.charAt(checkCol) == b.charAt(checkRow))
                answer.add(a.charAt(checkCol));

            currentValue--;
            checkCol--;
            checkRow--;
        }

        StringBuilder str = new StringBuilder();
        for(Character c : answer)
            str.append(c);

        return str.reverse().toString();
    }





}

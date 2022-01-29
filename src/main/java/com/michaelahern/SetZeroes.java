package com.michaelahern;

import java.util.Arrays;

public class SetZeroes {

    public void setZeroes(int[][] matrix) {

        boolean rowMarker = false;
        boolean colMarker = false;
        for(int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == 0) {
                rowMarker = true; break;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0) {
                colMarker = true; break;
            }
        }


        for(int i = 1; i < matrix.length; i++)
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }

        for(int j = 1; j < matrix[0].length; j++) {
            if(matrix[0][j] == 0) {
                for(int i = 0; i < matrix.length; i++)
                    matrix[i][j] = 0;

            }
        }


        for(int i = 1; i < matrix.length; i++)
            if(matrix[i][0] == 0)
                Arrays.fill(matrix[i], 0);



        if(rowMarker) {
            Arrays.fill(matrix[0], 0);
        }
        if(colMarker) {
            for(int i = 0; i < matrix.length; i++)
                matrix[i][0] = 0;
        }
    }

}

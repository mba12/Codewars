package com.michaelahern;

import java.util.Set;
import java.util.HashSet;

public class FindJudge {

    public int findJudge(int n, int[][] trust) {

        int[][] matrix = new int[n + 1][n + 1];

        int[] t = new int[n + 1];
        Set<Integer> trusted = new HashSet<>();
        for(int[] p : trust) {
            matrix[p[0]][p[1]] = 1;
        }

        int total = 0;
        for(int j = 1; j <= n; j++) {
            total = 0;
            for(int i = 1; i <= n; i++) {
                total += matrix[i][j];
            }
            if(total == n - 1 && checkCandidate(matrix, j)) return j;
        }

        return -1;

    }

    public boolean checkCandidate(int[][] matrix, int c) {

        int total = 0;
        for(int i = 1; i <= matrix.length - 1; i++) {
            total += matrix[c][i];
        }
        return total == 0;
    }

}

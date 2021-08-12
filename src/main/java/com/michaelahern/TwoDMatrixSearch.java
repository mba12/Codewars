package com.michaelahern;

public class TwoDMatrixSearch {

    public boolean searchMatrix(int[][] matrix, int target) {

        int[] col = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            col[i] = matrix[i][0];
        }

        int row = binarySearch(col, target );
        row = binarySearchRow(matrix[row], target );

        if(row == -1)
        return false;
        else return true;

    }

    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        if(r < 0) r = 0;
        // if we reach here, then element was
        // not present
        return r;
    }

    int binarySearchRow(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }





}

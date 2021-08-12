package com.michaelahern;

public class MissingNumber {

    public int missingNumber(int[] arr) {

        int diff = 0;
        int maxDiff = 0;
        int minDiff = Integer.MAX_VALUE;
        int realMinDiff = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff > maxDiff) {
                maxDiff = diff;
                index = i;
            }

            if(diff < minDiff) {
                minDiff = diff;
                realMinDiff = arr[i + 1] - arr[i];
            }
        }
        return arr[index] + realMinDiff;
    }
}

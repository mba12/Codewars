package com.michaelahern;

import java.util.Arrays;

public class EraseOverlapIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {

        if(intervals.length == 1) return 0;

        Arrays.sort(intervals,(int[] a,int[] b)->{
            if(a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        int total = 0;
        int prevLeft = Integer.MIN_VALUE, prevRight = Integer.MIN_VALUE;
        int currentLeft, currentRight;
        for(int[] interval : intervals) {
            currentLeft = interval[0];
            currentRight = interval[1];

            if(currentLeft >= prevRight) {
                prevLeft = currentLeft;
                prevRight = currentRight;
            } else {
                total++;
                if(currentLeft != prevLeft && prevRight >= currentRight) {
                    prevRight = currentRight;
                    prevLeft = currentLeft;
                }
            }

        }

        return total;
    }


}

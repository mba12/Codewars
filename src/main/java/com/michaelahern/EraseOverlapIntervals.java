package com.michaelahern;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EraseOverlapIntervals {

    int min, original;
    Set<String> set = new HashSet<>();
    public int eraseOverlapIntervals(int[][] intervals) {

        if(intervals.length == 1) return 0;

        original = intervals.length;
        min = original;
        Arrays.sort(intervals,(int[] a,int[] b)->{
            if(a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        int length = intervals.length;
        int helper = helper(intervals, 0);

        return length - helper;
    }

    public int helper(int[][] intervals, int startIdx) {
        if(intervals.length < original - min) return -1;
        String str = Arrays.deepToString(intervals);
        if(set.contains(str)) {
            return -1;
        }
        set.add(str);

        int i = startIdx, j = i + 1;
        while(i < intervals.length && j < intervals.length) {
            if(intervals[i][0] == intervals[j][0]) {
                return Math.max(  helper(makeCopyMinusOne(intervals, i), i), helper(makeCopyMinusOne(intervals, j), i) );
            } else if(intervals[i][1] > intervals[j][0] ) {
                return Math.max(  helper(makeCopyMinusOne(intervals, i), i), helper(makeCopyMinusOne(intervals, j), i) );
            } else {
                i++; j++;
            }
        }

        if(original - intervals.length < min) min = original - intervals.length;
        return intervals.length;
    }

    public int[][] makeCopyMinusOne(int[][] list, int removeIdx) {
        int[][] newList = new int[list.length - 1][2];

        int idx = 0;
        for(int i = 0; i < list.length; i++) {
            if(i == removeIdx) continue;
            int[] newRow = new int[2];
            newRow[0] = list[i][0];
            newRow[1] = list[i][1];
            newList[idx++] = newRow;
        }

        return newList;
    }

}

package com.michaelahern;

import java.util.Arrays;

public class HIndex {

    public int hIndex(int[] citations) {
        if(citations.length == 1) {
            if (citations[0] > 0) {
                return 1;
            } else {
                return 0;
            }
        }

        Arrays.sort(citations);
        int count = 0, h = 0;
        for(int i = citations.length - 1; i > -1; i--) {
            if(citations[i] == 0) return count;
            if (count >= citations[i]) return count;
            count++;
        }

        return count;
    }
}

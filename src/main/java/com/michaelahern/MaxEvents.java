package com.michaelahern;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxEvents {

    public int maxEvents(int[][] events) {
        if (events == null || events.length == 0) return 0;
        Arrays.sort(events, (a,b)-> {
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int days = events.length;
        int i = 0, day = 0, result = 0;
        while(i < days || !pq.isEmpty()) {

            if(pq.isEmpty()) {
                day = events[i][0];
            }

            while(i < days && day == events[i][0]) {
                pq.add(events[i][1]);
                i++;
            }

            pq.poll();
            result++;
            day++;

            while (!pq.isEmpty() && day > pq.peek()) {
                pq.poll();
            }
        }

        return result;
    }

}

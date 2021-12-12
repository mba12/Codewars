package com.michaelahern;

import java.util.Arrays;

public class FindCheapestFlights {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        boolean relaxed;
        for (int i = 0; i <= k; ++i) {
            relaxed = false;
            int[] tmp = Arrays.copyOf(dist, n);
            for (int j = 0; j < flights.length; j++) {
                int u = flights[j][0];
                int v = flights[j][1];
                int weight = flights[j][2];
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < tmp[v] ) {
                    relaxed = true;
                    tmp[v] = dist[u] + weight;
                }
            }
            if(!relaxed) break;
            dist = tmp;

        }

        return dist[dst] == Integer.MAX_VALUE? -1 : dist[dst];
    }


}

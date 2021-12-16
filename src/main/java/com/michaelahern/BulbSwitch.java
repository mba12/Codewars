package com.michaelahern;

public class BulbSwitch {

    // NOTE: exceeding time limit
    public int bulbSwitch(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;

        boolean[] array = new boolean[n + 1];
        for(int i = 1; i <= n; i++)
            array[i] = true;

        int idx;
        for(int i = 2; i <= n; i += 2)
            array[i] = !array[i];

        for(int i = 3; i <= n; i++) {
            idx = i;
            while(idx <= n) {
                array[idx] = !array[idx];
                idx += i;
            }
        }

        int total = 0;
        for(int i = 1; i <= n; i++)
            if(array[i]) total++;

        return total;
    }
}

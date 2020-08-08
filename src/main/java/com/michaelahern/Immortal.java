package com.michaelahern;

public class Immortal {

    /** set true to enable debug */
    static boolean debug = false;

    static long elderAge(long n, long m, long k, long newp) {

         //long[][] matrix = new long[mInt][nInt];
        long total = 0l;
        for(long i = 0; i < n; i++) {
            //System.out.print("\n");
            for(long j = 0; j < m; j++) {
                long v = i ^ j;
                if (v < k)
                    v = 0;
                else
                    v = v - k;
                //System.out.print(v + ", ");
                total += v;
            }
        }
        // System.out.println("\n" + total);

        // System.out.println("\n" + total % newp);
        return total;
        // return total % newp;
    }



}

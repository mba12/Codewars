package com.michaelahern;

import java.math.BigInteger;

import static java.lang.StrictMath.log;

// A Dynamic Programming based Java
// Program for the Egg Dropping Puzzle
class EggDrop {

    // A utility function to get
    // maximum of two integers
    static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    /*  Function to get minimum number
        of trials needed in worst
        case with n eggs and k floors */
    static int eggDrop(int n, int k, int tries) {
        /* A 2D table where every eggFloor[i][j]
           will represent minimum number of trials
           needed for i eggs and j floors. */
        int eggFloor[][] = new int[n + 1][k + 1];
        int res;
        int i, j, x;

        // We need one trial for one floor and
        // 0 trials for 0 floors
        for (i = 1; i <= n; i++) {
            eggFloor[i][1] = 1;
            eggFloor[i][0] = 0;
        }

        // We always need j trials for one egg
        // and j floors.
        for (j = 1; j <= k; j++)
            eggFloor[1][j] = j;

        // PrettyPrinter printer = new PrettyPrinter(System.out);
        // printer.print(eggFloor);
        // Fill rest of the entries in table using
        // optimal substructure property
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= k; j++) {
                eggFloor[i][j] = Integer.MAX_VALUE;
                for (x = 1; x <= j; x++) {
                    res = 1 + max(
                            eggFloor[i - 1][x - 1],
                            eggFloor[i][j - x]);
                    if (res < eggFloor[i][j])
                        eggFloor[i][j] = res;

                    if(res == tries)
                        System.out.println("i: " + i + ", " + j);
                }
            }
        }

        // eggFloor[n][k] holds the result
        return eggFloor[n][k];
    }

    int superEggDrop(int k, int N) {
        if (k == 1 || N<3) return N;
        int n = (int) (log(N) / log(2));//n is the number of eggs we need when we do binary search

        // If the number of eggs is not enough to support our binary search, slowly increase the number of moves n until the return value of the fun function is greater than or equal to the target floor N
        if (k < n++)
            while (fun(k, n) < N) ++n;
        return n;
    }

    int fun(int k, int n) {
        int i=1,temp = 1, maxNumOfF = 0;
        while (i <= k) {
            temp = temp*(n--) / (i++);
            maxNumOfF += temp;
        }
        return maxNumOfF;
    }

    static long binomial(int x,int n,int k){

        int i;
        long answer=0;
        double aux=1;

        //Calculates C(n,k) using the formula: C(n,k): sum_i_0^k {(n-i+1)/i}
        for(i=1;i<=n;i++){

            aux*=(float)x+1-i;
            aux/=(float)i;
            answer+=aux;

            if(answer>k) break;
        }

        return answer;
    }

    public static void eggDropBinomial(int n, int k) {
        // int n; //Number of eggs
        // int k; //Number of floors

        System.out.println("Egg dropping puzzle: ( O(n log k)  solution )\n\n");
        System.out.println("Number of floors:" + k);
        System.out.println("Number of eggs:" + n);

        //Binary search variables:
        //Mid: middle
        //Upper: upper limit
        //Inf: inferior limit

        int mid,upper,inf;

        upper=k;
        inf=0;
        mid=(upper+inf)/2;

        //Binary search
        while(upper-inf>1){

            //Finds the middle
            mid=inf+(upper-inf)/2;

            //Define new limits
            if(binomial(mid,n,k)<k) inf=mid;
            else upper=mid;

        }

        System.out.println("\nNumber of drops in the worst case:" + inf+1);
    }

    public int superEggDropLCOriginal(int K, int N) {
        int lo = 1;
        int hi = N;

            while (lo < hi) {
                int mi = (lo + hi) / 2;
                int tries = f(mi, K, N);
                System.out.println("Eggs:" + K + " Floor: " + N + " Tries: " + tries);

                if (tries < N)
                    lo = mi + 1;
                else
                    hi = mi;
            }

        return lo;
    }

    // K eggs and N floors
    public int superEggDropLC(int K, int t) {
        int lo = 1;
        int hi = 2;
        int floor = 0;
        int maxFloor = Integer.MIN_VALUE;
        for(int N = 15; N < 25; N++) {
            lo = 1; hi = N;
            while (lo < hi) {
                int mi = (lo + hi) / 2;

                int tries = f(mi, K, N);

                System.out.println("Eggs:" + K + " Floor: " + N + " Tries: " + tries);

                if (tries < N)
                    lo = mi + 1;
                else
                    hi = mi;
            }
            if (lo > maxFloor) maxFloor = lo;
        }

        return maxFloor;
    }

    public int f(int x, int K, int N) {
        int ans = 0, r = 1;
        for (int i = 1; i <= K; ++i) {
            r *= x-i+1;
            r /= i;
            ans += r;
            if (ans >= N) break;
        }
        return ans;
    }

    int fun2(int eggs, int moves) {
        int i=1,temp = 1, maxNumOfF = 0;
        while (i <= eggs) {
            temp = temp*(moves--) / (i++);
            maxNumOfF += temp;
        }
        return maxNumOfF;
    }

    BigInteger height(BigInteger eggs, BigInteger moves) {
        BigInteger i = BigInteger.ONE;
        BigInteger temp = BigInteger.ONE;
        BigInteger maxNumOfF = BigInteger.ZERO;

        while (i.compareTo(eggs) <= 0) {
            temp = temp.multiply(moves).divide(i);
            maxNumOfF = maxNumOfF.add(temp);
            i = i.add(BigInteger.ONE);
            moves = moves.subtract(BigInteger.ONE);
        }
        return maxNumOfF;
        // result % 998244353
        /*
        Testing for:
        n = {62501} m = {53015}
        Testing for:
        n = {681} m = {24349}
        Testing for:
        n = {66993} m = {58224}
        Testing for:
        n = {51731} m = {597}
        Testing for:
        n = {76238} m = {67569}

         */
    }

}

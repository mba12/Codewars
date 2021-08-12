package com.michaelahern;

import java.math.BigInteger;

public class Immortal {
    static boolean debug = false;
    private static BigInteger TWO = BigInteger.ONE.add(BigInteger.ONE);

    public static long nextLargerPowerOfTwo(long x) {
        long t = 1L;
        while (t < x)
            t <<= 1;
        return t;
    }

    public static long rangeSum(long l, long r, long mod) {
        BigInteger bigL = BigInteger.valueOf(l);
        BigInteger bigR = BigInteger.valueOf(r);
        BigInteger bigMod = BigInteger.valueOf(mod);
        BigInteger left = bigL.add(bigR);
        BigInteger right = bigR.subtract(bigL).add(BigInteger.ONE);
        BigInteger mult = left.multiply(right);
        BigInteger div = mult.divide(TWO);
        return div.mod(bigMod).longValue();
    }

    private static long bigIntMultiply(long a, long b, long mod) {
        BigInteger bigA = BigInteger.valueOf(a);
        BigInteger bigB = BigInteger.valueOf(b);
        BigInteger bigMod = BigInteger.valueOf(mod);
        return bigA.multiply(bigB).mod(bigMod).longValue();
    }

    public static long elderAge(long m, long n, long l, long t) {

        System.out.println(m + ", " + n + ", " + l + ", " + t);
        if (m == 0L || n == 0L)
            return 0;
        if (m > n) {
            long temp = m;
            m = n;
            n = temp;
        }
        long lm = nextLargerPowerOfTwo(m);
        long ln = nextLargerPowerOfTwo(n);

        if (l > ln)
            return 0;

        if (lm == ln) {
            long rSum = rangeSum(1, ln - l - 1, t);
            long height = (m + n - ln);
            long subTotal = bigIntMultiply(rSum, height, t);
            long elderAge = elderAge(ln - n, lm - m, l, t);
            return (subTotal + elderAge) % t;
        }

        if (lm < ln) {
            lm = ln / 2;
            long rangeSum1 = rangeSum(1, ln - l - 1, t);
            long rangeSum2 = rangeSum(Math.max(0, lm - l), ln - l - 1, t);
            long subTotal1 = bigIntMultiply(rangeSum1, m, t);
            long subTotal2 = bigIntMultiply(ln - n, rangeSum2, t);
            long temp = subTotal1 - subTotal2;
            if (l <= lm) {
                BigInteger a = BigInteger.valueOf(lm - l);
                BigInteger b = BigInteger.valueOf(lm - m);
                BigInteger c = BigInteger.valueOf(ln - n);
                BigInteger abc = a.multiply(b).multiply(c);
                long elder = elderAge(lm - m, ln - n, 0, t);
                BigInteger elderBig = BigInteger.valueOf(elder);
                temp = BigInteger.valueOf(temp).add( abc ).add(elderBig).mod(BigInteger.valueOf(t)).longValue();
            } else {
                long elder = elderAge(lm - m, ln - n, l - lm, t);
                BigInteger elderBig = BigInteger.valueOf(elder);
                temp = BigInteger.valueOf(temp).add(elderBig).mod(BigInteger.valueOf(t)).longValue();
            }
            return temp % t;
        }
        return 0L;
    }



    static long elderAge2(long n, long m, long k, long newp) {
        if (m > n) {
            long temp = m;
            m = n;
            n = temp;
        }

        long lm = nextLargerPowerOfTwo(m);
        long ln = nextLargerPowerOfTwo(n);

        System.out.println("Larger Power n for " + n + ": " + nextLargerPowerOfTwo(n));
        System.out.println("Larger Power m for " + m + ": " + nextLargerPowerOfTwo(m));
        System.out.println("Elder Age: " + elderAge(n, m, k, newp));


         //long[][] matrix = new long[mInt][nInt];
        long total = 0l;
        long vTotal = 0l;

        for(long i = 0; i < n; i++) {
            System.out.print("\n");
            for(long j = 0; j < m; j++) {
                long v = i ^ j;
                vTotal += v;
                System.out.print(v + "\t");
                if (v < k)
                    v = 0;
                else
                    v = v - k;

                total += v;
            }
        }
        // System.out.println("\n" + total);

        System.out.println("\n\n" + total);
        System.out.println(vTotal);

        return total;
        // return total % newp;
    }

    static long elderAgeBruteForce(long n, long m, long k, long newp) {
        System.out.println(n + ", " + m + ", " + k + ", " + newp);
        int mInt = (int) m;
        int nInt = (int) n;
        //long[][] matrix = new long[mInt][nInt];
        long total = 0l;
        for(int i = 0; i < nInt; i++) {
            for(int j = 0; j < mInt; j++) {
                int v = i ^ j;
                if (v < k)
                    v = 0;
                else
                    v = v - (int) k;
                //matrix[i][j] = v;
                total += (long) v;
            }
        }

        return total % newp;
    }




}

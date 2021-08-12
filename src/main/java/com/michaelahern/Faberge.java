package com.michaelahern;
import java.math.BigInteger;
import java.util.TreeMap;

/*
            BigInteger i = BigInteger.ONE;
            BigInteger temp = BigInteger.ONE;

            while (i.compareTo(n) <= 0) {
                temp = temp.multiply(m).divide(i);
                maxNumOfF = maxNumOfF.add(temp);
                map.put(m, maxNumOfF);
                i = i.add(BigInteger.ONE);
                m = m.subtract(BigInteger.ONE);
            }
        }
*/

public class Faberge {
    private static BigInteger mo = BigInteger.valueOf(998244353);
    private static long mod = 998244353L;
    private static BigInteger[] dpBig = new BigInteger[80001];
    static { preCalc(); }

    public static void preCalc() {
        dpBig[0] = BigInteger.ZERO; dpBig[1] = BigInteger.ONE;
        BigInteger x, y, z, zz, abc;
        int i;
        for(int j = 2; j < 80001; j++) {
            x = mo.divide(BigInteger.valueOf(j));
            y = mo.subtract(x);
            i = mo.mod(BigInteger.valueOf(j)).intValue();
            z = dpBig[i];
            zz = z.mod(mo);
            dpBig[j] = (y.multiply(zz)).mod(mo);
        }
    }

    public static BigInteger height(BigInteger n, BigInteger m) {

        int eggs = n.intValue();
        int moves = m.mod(mo).intValue();
        BigInteger maxNumOfF = BigInteger.ZERO;
        BigInteger temp = BigInteger.ONE;

        for(int j = 1; j <= eggs; j++) {
            temp = temp.multiply(BigInteger.valueOf(moves - j + 1)).multiply(dpBig[j]).mod(mo);
            maxNumOfF = (maxNumOfF.add(temp)).mod(mo);
        }

        return maxNumOfF;
    }

    static long fun2(long eggs, long moves) {
        long i=1L,temp = 1L, maxNumOfF = 0L;

        while (i <= eggs) {
            temp = (temp*moves/i) % mod;
            maxNumOfF = (maxNumOfF + temp) % mod;
            moves--;
            i++;
        }
        return maxNumOfF;
    }

}


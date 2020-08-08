package com.michaelahern;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static BigInteger negativeOne = BigInteger.ZERO.subtract(BigInteger.ONE);
    private static BigInteger TWO = BigInteger.ONE.add(BigInteger.ONE);
    private static Map<BigInteger, BigInteger> fibMap = new HashMap<>();

    public static BigInteger fib(BigInteger n) {

        if(n.compareTo(BigInteger.ZERO) == 0) {
            return n;
        }
        if(n.compareTo(BigInteger.ONE) == 0) {
            return n;
        }

        if(n.compareTo(BigInteger.ZERO) < 0) {
            return fibNegativeRecursive(n);
        } else {
            return fibMatrix(n);
        }
    }

    public static BigInteger fibNegativeRecursive(BigInteger n) {

        if(n.equals(BigInteger.ZERO)) return BigInteger.ZERO;
        if(n.equals(negativeOne)) return BigInteger.ONE;

        BigInteger nPlus2 = n.add(TWO);
        BigInteger nPlus2Val;
        BigInteger nPlus1 = n.add(BigInteger.ONE);
        BigInteger nPlus1Val;
        if (fibMap.containsKey(nPlus2)) {
            nPlus2Val = fibMap.get(nPlus2);
        } else {
            nPlus2Val = fibNegativeRecursive(nPlus2);
            fibMap.put(nPlus2, nPlus2Val);
        }

        if (fibMap.containsKey(nPlus1)) {
            nPlus1Val = fibMap.get(nPlus1);
        } else {
            nPlus1Val = fibNegativeRecursive(nPlus1);
            fibMap.put(nPlus1, nPlus1Val);
        }

        return nPlus2Val.subtract(nPlus1Val);

    }

    public static BigInteger[][] mmult(BigInteger[][] A,BigInteger[][] B) {
        // assumes A,B are 2x2 matrices

        BigInteger a = A[0][0].multiply(B[0][0]).add(A[0][1].multiply(B[1][0]));
        BigInteger b = A[0][0].multiply(B[0][1]).add(A[0][1].multiply(B[1][1]));
        BigInteger c = A[1][0].multiply(B[0][0]).add(A[1][1].multiply(B[1][0]));
        BigInteger d = A[1][0].multiply(B[0][1]).add(A[1][1].multiply(B[1][1]));
        BigInteger[][] matrix = {  {a,b}, {c,d}};
        return matrix;

    }
    private static final BigInteger[][] matrixOne = {  {BigInteger.ONE,BigInteger.ONE}, {BigInteger.ONE,BigInteger.ZERO}};
    public static BigInteger[][]  mpow(BigInteger[][] A, int n) {
        // assumes A is 2x2
        if (n == 0)
            return matrixOne;
        else if (n == 1) {
            BigInteger[][] newA = { {A[0][0].add(BigInteger.ZERO), A[0][1].add(BigInteger.ZERO) }, {A[1][0].add(BigInteger.ZERO), A[1][1].add(BigInteger.ZERO) }};
            return newA; // copy of A
        } else {
            int[] mod = divMod(n);
            BigInteger[][] B = mpow(A, mod[0]);
            B = mmult(B, B);
            if (mod[1] > 0) {
                B = mmult(B, A);
            }
        return B;
        }
    }

    private static int[] divMod(int n) {
        int d = n / 2;
        int r = n % 2;
        int[] answer = new int[2];
        answer[0] = d;
        answer[1] = r;
        return answer;
    }

    public static BigInteger fibMatrix(BigInteger n) {
        return fibMatrix(n.intValue());
    }

    public static BigInteger fibMatrix(int n) {
        return mpow(matrixOne,n)[0][1];
    }


}

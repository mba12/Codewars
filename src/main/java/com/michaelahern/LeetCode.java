package com.michaelahern;

public class LeetCode {

    public int[] addNegabinary(int[] arr1, int[] arr2) {

        int len1 = arr1.length;
        long one = tensPower(arr1);
        long two = tensPower(arr2);
        long total = one + two;
        String neg = negativeBase(total, -2l);

        int[] bitArr = new int[neg.length()];
        for(int i = 0; i < neg.length(); i++) {
            bitArr[i] = Integer.parseInt(String.valueOf(neg.charAt(i)));
        }
        return bitArr;

    }

    public String negativeBase(long integer, long base) {
        if(integer == 0) return "0";
        String result = "";
        long number = integer;
        while (number != 0) {
            long i = number % base;
            number /= base;
            if (i < 0) {
                i += Math.abs(base);
                number++;
            }

            result = i + result;
        }

        return result;
    }

    public int tensPower(int[] arr) {
        int total = 0;
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            if(arr[i] == 1)
                total += twoPower(len - 1 - i);
        }
        return total;
    }

    public int twoPower(int x) {
        int total = 1;
        if(x == 0) return 1;

        for(int i = 0; i < x; i++)
            total = total * 2;

        if(x % 2 == 0)
            return total;
        else
            return -total;
    }



}

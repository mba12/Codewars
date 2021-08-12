package com.michaelahern;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;



public class Anagrams {

    public BigInteger listPosition(String word) {
        String sorted = sortWord(word);

        return BigInteger.ZERO;
    }

    static String sortWord(String word) {

        char[] cArr = word.toCharArray();
        Arrays.sort(cArr);
        return String.valueOf(cArr);
    }

    static int[] getFactoradic(int n) {
        int[] factoradic = new int[13];
        int i = 1;
        while (n != 0) {
            factoradic[13 - i] = n % i;
            n = n / i;
            i++;
        }
        return factoradic;
    }

    static String getPermutation(char[] str, int[] factoradic) {
        Arrays.sort(str);
        ArrayList<Character> res = new ArrayList<Character>();
        StringBuilder sb = new StringBuilder();
        int pos;
        char c;
        String perm = "";
        boolean[] used = new boolean[str.length]; // by default values are initialised to false.
        for (int i = 0; i < factoradic.length; i++) {
            pos = factoradic[i];
            c = getUnusedCharAtPos(str, pos, used);
            res.add(c);
        }
        for (char some_c : res) {
            sb.append(some_c);
        }
        return (sb.toString());
    }

    private static char getUnusedCharAtPos(char[] str, int pos, boolean[] used) {
        int count = -1;
        for (int i = 0; i < str.length; i++) {
            if (!used[i]) {
                count++;
                if (count == pos) {
                    used[i] = true;
                    return str[i];
                }
            }
        }
        return ' ';
    }

}

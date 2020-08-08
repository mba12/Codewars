package com.michaelahern;

public class RailFenceCipher {

    static String encode(String s, int n) {

        if(s == null || s.length() < 1) {
            return s;
        }

        char[] original = s.toCharArray();
        char[] cipher = new char[s.length()];
        int length = cipher.length;

        int diffLength = 2*n - 2;
        int[] diff = new int[n - 1];
        int start = n * 2 - 2;
        for(int k = 0; k < diff.length; k++ ) {
            diff[k] = start;
            start -= 2;
        }

        int next, counter;
        int i = 0;
        for(int j = 0; j < n; j++) {
            next = j;
            counter = 0;
            while(i < length && next < length) {
                cipher[i] = original[next];
                if(j == 0 || j == (n-1)) {
                    next += diff[0];
                } else {
                    if(counter % 2 == 0) {
                        next += diff[j];
                    } else {
                        next += (diff[diff.length - j]);
                    }
                }
                i++; counter++;
            }
        }

        return String.valueOf(cipher);
    }

    static String decode(String s, int n) {

        if(s == null || s.length() < 1) {
            return s;
        }

        char[] cipher = s.toCharArray();
        char[] original = new char[s.length()];
        int length = cipher.length;

        int[] diff = new int[n - 1];
        int start = n * 2 - 2;
        for(int k = 0; k < diff.length; k++ ) {
            diff[k] = start;
            start -= 2;
        }

        int next, counter;
        int i = 0;
        for(int j = 0; j < n; j++) {
            next = j;
            counter = 0;
            while(i < length && next < length) {
                original[next] = cipher[i];
                if(j == 0 || j == (n-1)) {
                    next += diff[0];
                } else {
                    if(counter % 2 == 0) {
                        next += diff[j];
                    } else {
                        next += (diff[diff.length - j]);
                    }
                }
                i++; counter++;
            }
        }

        return String.valueOf(original);
    }

}

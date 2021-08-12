package com.michaelahern;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FrequenceSort {


    public String frequencySort(String s) {
        int[][] array = new int['z' + 1][2];

        for(int i = 0; i < 48; i++) {
            array[i][1] = -99;
            array[i][0] = i;
        }

        for(int i = 58; i < 65; i++) {
            array[i][1] = -99;
            array[i][0] = i;
        }

        for(int i = 91; i < 97; i++) {
            array[i][1] = -99;
            array[i][0] = i;
        }

        byte[] c = s.getBytes(StandardCharsets.US_ASCII);
        for(byte x : c) {
            array[x][1]++;
            array[x][0] = x;
        }

        Arrays.sort(array, (a, b) -> Integer.compare(b[1],a[1]));

        char[] answer = new char[s.length()];
        int index = 0;
        for(int[] y : array) {
            if(y[1] == 0) break;
            for(int i = 0; i < y[1]; i++) {
                answer[index++] = new Character((char) y[0]).charValue();
            }
        }

        return new String(answer);
    }



}

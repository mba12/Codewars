package com.michaelahern;

import java.util.Arrays;

public class NextGreaterElement {
    // nextBiggerNumber
    public long nextGreaterElement(int n) {
        try {
            char[] number = Integer.toString(n).toCharArray();
            char temp = ' ';
            char pivot = ' ';
            int index = 0;
            boolean found = false;
            // find the first instance of a number that is larger
            // than it's immediate neighbor
            for(int i = number.length - 1; i > 0; i--) {
                if (number[i] > number[i - 1]) {
                    pivot = number[i - 1];
                    index = i - 1;
                    found = true;
                    break;
                }
            }
            if(!found) return -1;

            // find the smallest element right of the pivot
            // that is greater than the pivot
            int indexToSwap = findMinGreaterThanPivot(number, index, pivot);
            if(indexToSwap == -1) return -1;

            temp = number[indexToSwap];
            number[indexToSwap] = number[index];
            number[index] = temp;
            Arrays.sort(number,index + 1,number.length);
            String s = new String(number);
            return Long.parseLong(s);

        } catch (NumberFormatException nfe) {
            return -1;
        }
    }

    private int findMinGreaterThanPivot(char[] number, int index, char pivot) {
        Arrays.sort(number,index,number.length);

        for(int i = index; i < number.length; i++) {
            if( number[i] > pivot) return i;
        }
        return -1;
    }

}

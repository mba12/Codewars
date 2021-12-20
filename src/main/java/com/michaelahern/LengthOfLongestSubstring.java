package com.michaelahern;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0) return 0;
        int[] characters = new int[256];
        char[] sArr = s.toCharArray();
        int left = 0, right = 1;
        int max = 1;
        int ascii = (int) sArr[left];
        characters[ascii]++;
        int len = 1;

        while(left <= right && right < sArr.length) {
            ascii = (int) sArr[right];
            if(characters[ascii] == 0 ) {
                len = right - left + 1;
                if (len > max) max = len;
                characters[ascii]++;
            } else {
                while( characters[ascii] > 0 ) {
                    characters[(int) sArr[left]]--;
                    left++;
                }
                characters[ascii]++;
            }
            right++;
        }
        return max;
    }
}

package com.michaelahern;


public class CheckValidString {

    public boolean checkValidString(String s) {
        int min = 0, max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                max++; min++;
            } else if (c == ')') {
                max--; min--;
            } else if (c == '*') {
                max++; min--;
            }
            if (max < 0) return false;
            min = Math.max(min, 0);
        }
        return min == 0;
    }


}

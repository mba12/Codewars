package com.michaelahern;

public class LongestCommonSubsequence_LC {
    int max = 0;
    public int longestCommonSubsequenceLC(String text1, String text2) {
        System.out.print(text1 + ", " + text2);
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();

        for(int i = 0; i < t1.length; i++)
            for(int j = 0; j < t2.length; j++) {
                if(t1[i] == t2[j]) {
                    max = Math.max(max, 1 + longestCommonSubsequenceLC(text1.substring(i + 1), text2.substring(j + 1))) ;
                }
            }
        System.out.println(" " + max);
        return max;

    }


}

package com.michaelahern;

public class CheckInclusion {

    public boolean checkInclusion(String s1, String s2) {
        int[] characters = new int[27];
        int[] temp = new int[27];

        char[] s1Arr = s1.toCharArray();
        for(char c : s1Arr)
            characters[c - 97]++;

        char[] s2Arr = s2.toCharArray();
        int len = s1Arr.length;

        boolean match = false;
        for(int right = 0; right < s2Arr.length; right++) {
            if( characters[s2Arr[right] - 97] > 0 ) {
                match = true;
                System.arraycopy(characters, 0, temp, 0, 27);
                for(int i = right; i < right + len && i < s2Arr.length; i++) {
                    //System.out.println(i + " : " + right + " : " + len);
                    if( temp[s2Arr[i] - 97] > 0  )
                        temp[s2Arr[i] - 97]--;
                    else {
                        match = false;
                        break;
                    }
                }

                if(match) {
                    int total = 0;
                    for(int i : temp) {
                        total += i;
                    }
                    return total == 0;
                }
            }
        }

        return match;
    }
}

package com.michaelahern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReorganizeString {

    public String reorganizeString(String s) {
        char[] arr = s.toCharArray();
        List<Character> answer = new LinkedList<>();
        int[] counter = new int['z' + 1];

        for(char c : arr) {
            counter[c]++;
        }
        int arrSorted[][] = new int[26][2];
        int idx = 0;
        for(int i = 'a'; i < 'z' + 1; i++) {
            arrSorted[i - 'a'][0] = idx;
            arrSorted[i - 'a'][1] = counter[i];
            idx++;
        }

        int letterCount = 0;
        for(int i = 0; i < arrSorted.length; i++)
            if(arrSorted[i][1] > 0) letterCount++;

        if(letterCount > 0) {
            char c = (char) (arrSorted[0][0] + 'a');
            answer.add(c);
            arrSorted[0][1]--;
            if(arrSorted[0][1] == 0) letterCount--;
        }

        sortbyColumn(arrSorted, 1);
        idx = 0;
        int next = 1;
        while(letterCount > 0 && arrSorted[idx][1] > 0) {
            char c = (char) (arrSorted[idx][0] + 'a');
            while(letterCount > 1)
            if(answer.get(idx - 1) != c && (idx == answer.size() || idx != answer.get(next))) {
                answer.add(idx, (char) arrSorted[idx][0]);
                arrSorted[idx][1]--;
                if(arrSorted[idx][1] == 0) letterCount--;
            }
            idx++; next++;
            if (arrSorted[idx][1] == 0 ) idx = 0;
        }

        System.out.println(Arrays.toString(arrSorted));
        return "";
    }

    // Function to sort by column
    public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2) {

                // To sort in descending order revert
                // the '>' Operator
                if (entry1[col] < entry2[col])
                    return 1;
                else
                    return -1;
            }
        });  // End of function call sort().
    }

}

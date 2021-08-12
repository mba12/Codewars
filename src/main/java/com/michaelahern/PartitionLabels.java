package com.michaelahern;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {

        int[] li = new int[26];
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            char ch = chars[i];
            li[ch-'a'] = i;
        }

        ArrayList<Integer> list = new ArrayList<>();

        int previous = 0, end = 0;
        for(int i=0;i<chars.length;i++){

            end = Math.max(end, li[chars[i]-'a']);
            if(end == i) {
                list.add(i - previous + 1);
                previous = i + 1;
            }
        }

        return list;

    }

}

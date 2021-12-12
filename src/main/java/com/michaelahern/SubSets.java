package com.michaelahern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SubSets {
    public static long getTotalImbalance(List<Integer> weight) {

        System.out.println("Input: " + Arrays.toString(weight.toArray()));
        List<List<Integer>> subsets = createSubsets(weight);
        int total = 0;
        for(List<Integer> row : subsets) {
            if(row.size() <= 1) continue;
            System.out.print(Arrays.toString(row.toArray()));
            Collections.sort(row);
            int min = row.get(0);
            int max = row.get(row.size() -1);
            total += (max - min);
            System.out.println(total);
        }

        return total;
    }


    public static List<List<Integer>> createSubsets(List<Integer> nums) {
        List<List<Integer>> list = new ArrayList<>();
        createSubset(list,  nums, 0, new ArrayList<>());
        return list;
    }

    private static void createSubset(List<List<Integer>> list , List<Integer> weight, int start, List<Integer> row){
        list.add(new ArrayList<>(row));
        for(int i = start; i < weight.size(); i++){
            // add element
            row.add(weight.get(i));
            // Explore
            createSubset(list, weight, i + 1, row );
            // remove
            row.remove(row.size() - 1);
        }
    }


}

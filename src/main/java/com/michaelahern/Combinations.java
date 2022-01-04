package com.michaelahern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations {
    List<List<Integer>> answer;
    List<Integer> master;
    public List<List<Integer>> combine(int n, int k) {
        answer = new ArrayList<>();
        if(n == 1 && k == 1) {
            List<Integer> l = new ArrayList<>();
            l.add(1);
            answer.add(l);
            return answer;
        }

        master = new LinkedList<>();
        for(int i = 1; i <= n; i++)
            master.add(i);

        List<Integer> mList = new LinkedList<>(master);
        while(mList.size() >= k) {
            List<Integer> subList = new LinkedList<>();
            subList.add(mList.remove(0));
            List<Integer> restOfList = new LinkedList<>(mList);
            helper(restOfList, subList, k - 1);
        }
        return answer;
    }

    public void helper(List<Integer> restOfList, List<Integer> subList, int k) {

        if(k == 0) {
            answer.add(subList);
            return;
        }
        while(restOfList.size() >= k) {
            List<Integer> newList = new LinkedList<>(subList);
            newList.add(restOfList.remove(0));
            List<Integer> newRestOfList = new LinkedList<>(restOfList);
            helper(newRestOfList, newList, k - 1);
        }
    }
}

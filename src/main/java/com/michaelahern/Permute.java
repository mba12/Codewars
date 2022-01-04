package com.michaelahern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permute {

    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<Integer> master = new LinkedList<>();
        for(int i : nums) master.add(i);

        for(int i = 0; i < len; i++) {
            List<Integer> copy = new LinkedList<>(master);
            List<Integer> p = new LinkedList<>();
            p.add(copy.remove(i));
            helper(p, copy);
        }
        return answer;
    }

    public void helper(List<Integer> added, List<Integer> remaining) {
        if(remaining.size() == 0) {
            answer.add(added);
            return;
        }

        for(int i = 0; i < remaining.size(); i++) {
            List<Integer> copy = new LinkedList<>(remaining);
            List<Integer> per = new LinkedList<>(added);
            per.add(copy.remove(i));
            helper(per, copy);
        }
        return;

    }

}

package com.michaelahern;

import java.util.HashMap;
import java.util.Map;

public class JPM {

    Map<String, Integer> map = new HashMap<>();
    public int[] multiplyArray(int[] nums) {

        if(nums.length <= 1) return nums;

        int zeroCount = 0;
        for(int i : nums) {
            if(i == 0) zeroCount++;
        }

        int[] answer = new int[nums.length];
        if(zeroCount < 2) {

            int total = 1;
            for(int i = 0; i < nums.length; i++)
                total *= nums[i];

            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) {
                    answer[i] = helper(nums, i);
                } else {
                    answer[i] = total / nums[i];
                }
            }
        }

        return answer;
    }

    public int helper(int[] nums, int j) {
        int total = 1;

        for(int i = 0; i < nums.length; i++)
            if(i != j) { total *= nums[i]; }

        return total;

    }

}

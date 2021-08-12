package com.michaelahern;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public ContiguousArray() {}

    public int longest(int[] nums) {

        int max = 0;
        int total = 0;
        Map<Integer, Integer> map  = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                total += -1;
            else
                total += 1;

            if(map.containsKey(total)) {
                max = Math.max(max, i - map.get(total));
            } else {
                map.put(total, i);
            }

        }
        return max;

    }
}

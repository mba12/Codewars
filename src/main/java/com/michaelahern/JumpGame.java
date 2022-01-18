package com.michaelahern;

import java.util.HashMap;
import java.util.Map;

public class JumpGame {

    Map<Integer, Boolean> map = new HashMap<>();

    public boolean canJump(int[] nums) {
        if(nums[0] == 0) return false;

        for(int i = nums.length - 1; i > 0; i--) {

            if(nums[i] == 0)  {
                int temp = i - 1;
                boolean flag = false;
                while(temp >= 0 && !flag) {
                    if(nums[temp] > i - temp || (temp + nums[temp] != nums.length - 1))
                        flag = true;
                    else
                        temp--;
                }
                if(!flag)
                    return false;
            }

        }
        return true;

    }

    /*
    public boolean canJump(int[] nums) {

        boolean zeroes = false;
        for(int i : nums)
            if(i == 0) { zeroes = true; break; }

        if(zeroes == false) return true;

        return helper(nums, 0);
    }
    */

    public boolean helper(int[] nums, int index) {

        if(index >= nums.length - 1) return true;

        if(nums[index] == 0 && index < nums.length - 1) return false;

        boolean result = false;
        for(int i = 1; i <= nums[index]; i++) {

            if(index + i >= nums.length - 1) return true;
            if(nums[index + i] == 0) continue;

            if(map.containsKey(index + i) && map.get(index + i))
                return true;

            if(helper(nums, index + i)) result = true;;

        }
        map.put(index, result);
        return result;

    }
}

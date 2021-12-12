package com.michaelahern;

public class FindUnsortedSubarray {

    public int findUnsortedSubarray(int[] nums) {

        if(nums.length == 0) return 0;
        if(nums.length == 1) return 0;
        if(nums.length == 2) {
            if(nums[0] > nums[1])
                return 2;
            else
                return 0;
        }

        int max = nums[0], min = nums[nums.length - 1];
        int end = 0, start = nums.length - 1;
        for(int i = 0; i < nums.length; i++) {
            max = nums[i] > max? nums[i] : max;
            if(nums[i] < max) {
                end = i;
            }
        }

        for(int i = nums.length - 1; i >= 0 ; i--) {
            min = nums[i] < min? nums[i] : min;
            if(nums[i] > min) {
                start = i;
            }

        }

        if(start == end)
            return nums.length;
        else if(end - start < 0 )
            return 0;
        else
            return end - start + 1;
    }

}

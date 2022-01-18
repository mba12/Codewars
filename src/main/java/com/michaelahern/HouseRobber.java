package com.michaelahern;

public class HouseRobber {

    int len = 0;
    int[] sums;
    public int rob(int[] nums) {
        sums = new int[nums.length + 3];
        for(int i = 0; i < sums.length; i++)
            sums[i] = -1;

        len = nums.length - 1;

        return Math.max(helper(nums, 0), helper(nums, 1));
    }

    public int helper(int[] nums, int n) {

        if(n >= nums.length) return 0;

        if( sums[n + 2] == -1 ) {
            sums[n + 2] = helper(nums, n + 2);
        }

        if( sums[n + 3] == -1 ) {
            sums[n + 3] = helper(nums, n + 3);
        }

        return nums[n] + Math.max(sums[n + 2], sums[n + 3]);
    }

}

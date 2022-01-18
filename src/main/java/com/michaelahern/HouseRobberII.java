package com.michaelahern;

public class HouseRobberII {

    public int rob(int[] nums) {

        int len = nums.length;

        switch(len) {
            case 0:
                return 0;
            case 1:
                return nums[0];
            case 2:
                return Math.max(nums[0], nums[1]);
            case 3:
                return Math.max( Math.max(nums[0], nums[1]), nums[2]);
        }

        int[] sumsOne = new int[nums.length + 3];
        int[] sumsTwo = new int[nums.length + 3];
        int[] sumsThree = new int[nums.length + 3];

        for(int i = 0; i < sumsOne.length; i++) {
            sumsOne[i] = -1;
            sumsTwo[i] = -1;
            sumsThree[i] = -1;
        }

        int one = helper(nums, sumsOne,0, 0);
        int two = helper(nums, sumsTwo, 1, 1);
        int three = helper(nums, sumsThree, 2, 2);
        return Math.max( Math.max(one, two), three);
    }

    public int helper(int[] nums, int[] sums, int n, int startNode) {

        if(n >= nums.length || (n == nums.length - 1 && startNode == 0)) return 0;

        if( sums[n + 2] == -1 ) {
            sums[n + 2] = helper(nums, sums, n + 2, startNode);
        }

        if( sums[n + 3] == -1 ) {
            sums[n + 3] = helper(nums, sums, n + 3, startNode);
        }
        return nums[n] + Math.max(sums[n + 2], sums[n + 3]);
    }

}

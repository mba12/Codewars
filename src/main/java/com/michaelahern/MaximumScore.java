package com.michaelahern;

public class MaximumScore {

    int max = 0;
    int[][] memo;
    public int maximumScore(int[] nums, int[] multipliers) {

        max = multipliers.length;

        if(max == 1) {
            int scoreLeft = nums[0] * multipliers[0];
            int scoreRight = nums[nums.length - 1] * multipliers[0];
            return Math.max(scoreLeft, scoreRight);
        }

        memo = new int[max][max];
        return helper(nums, multipliers, 0, 0);

    }

    public int helper(int[] nums, int[] multipliers, int left, int count) {

        if(count == max) {
            return 0;
        }

        if(memo[count][left] == 0) {
            int right = nums.length - 1 - (count - left);
            int scoreLeft = nums[left] * multipliers[count];
            int scoreRight = nums[right] * multipliers[count];

            int myLeft = scoreLeft + helper(nums, multipliers, left + 1, count + 1);
            int myRight = scoreRight + helper(nums, multipliers, left, count + 1);
            memo[count][left] = Math.max(myLeft, myRight);
        }
        return memo[count][left];
    }
}

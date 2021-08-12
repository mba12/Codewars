package com.michaelahern;

import java.util.Arrays;

public class TwoSumLessThanK {

    public int twoSumLessThanK(int[] nums, int k) {

        if(nums.length == 1) return -1;
        int maxSum = -1;
        Arrays.sort(nums);

        int idx = Arrays.binarySearch(nums, k);

        if(idx < 0) {
            idx = -(idx + 1) - 1;
        } else {
            idx--;
        }

        if(idx == 0 && nums[idx] + nums[idx + 1] > k) {
            return -1;
        }

        int target = 0, tIdx = 0, base = 0;
        while(idx >= 0) {
            target = k - nums[idx];
            tIdx = Arrays.binarySearch(nums, target);

            if(tIdx < 0) {
                tIdx = -(tIdx + 1) - 1;
            }

            if(tIdx >= 0 && tIdx != idx) {
                base = nums[idx] + nums[tIdx];
                if(base == k && tIdx > 0) {
                    tIdx--;
                    base = nums[idx] + nums[tIdx];
                }
                if(base < k && base > maxSum)
                    maxSum = base;
            }

            idx--;
        }

        return maxSum;

    }

}

package com.michaelahern;

public class MinSubArrayLen {

    int minLen = Integer.MAX_VALUE;
    public int minSubArrayLen(int target, int[] nums) {

        if(nums.length == 1) {
            if(nums[0] >= target)
                return 1;
            else
                return 0;
        }
        subTotalCheck(target, nums[0], 0, 0);
        int left = 0, right = 1;
        int arrLen = nums.length;
        int subTotal = nums[left] + nums[right];
        subTotalCheck(target, subTotal, left, right);

        while(right < arrLen) {

            if(subTotal == target) {
                right++;
                if(right < arrLen) {
                    subTotal = subTotal - nums[left] + nums[right];
                    left++;
                    subTotalCheck(target, subTotal, left, right);
                }
            } else if(subTotal < target) {
                right++;
                if(right < arrLen) {
                    subTotal = subTotal + nums[right];
                    subTotalCheck(target, subTotal, left, right);
                }
            } else if(subTotal > target) {
                subTotal = subTotal - nums[left];
                left++;
                subTotalCheck(target, subTotal, left, right);
            }
        }

        return minLen == Integer.MAX_VALUE? 0 : minLen;

    }

    public void subTotalCheck(int target, int subTotal, int left, int right) {
        if(subTotal >= target) {
            int length = right - left + 1;
            if(length < minLen) minLen = length;
        }
    }


}

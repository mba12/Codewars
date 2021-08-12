package com.michaelahern;

import java.util.Arrays;

public class RotatedSortedArray {

    public int search(int[] nums, int target) {

        if(nums.length == 1) {
            if(nums[0] == target)
                return 0;
            else
                return -1;
        }
        int split = nums.length;
        if(nums[0] > nums[nums.length - 1]) {
            split = findSplit(nums);
        }

        int index = Arrays.binarySearch(nums, 0, split, target);
        if (index >= 0) return index;

        index = Arrays.binarySearch(nums, split, nums.length, target);
        if(index >= 0) return index;
        return -1;
    }


    private int findSplit(int[] nums) {

        int mid = 0;
        int low = 0;
        int high = nums.length - 1;

        while ( low < high) {

            mid = (low + high)/ 2;

            if(mid == 0) {
                if (nums[mid] < nums[mid + 1])
                return 0;
                else return 1;
            }

            if(mid > 0 && mid < nums.length - 1) {
                if(nums[mid - 1] > nums[mid] && nums[mid + 1] > nums[mid])
                    return mid;
            }

            if(nums[low] < nums[mid] && nums[mid] < nums[high]) {
                if (low == 0) return 0;
                else if(low > 0 && low < nums.length - 1) {
                    if(nums[low - 1] > nums[low] && nums[low + 1] > nums[low])
                        return low;
                }
            } else if(nums[low] >= nums[mid]) {
                if(high - low == 1 && nums[low] > nums[high]) {
                    return high;
                } else {
                    high = mid - 1;
                }
            } else if (nums[high] < nums[mid]) {
                low = mid + 1;
            }

        }

        return low;

    }
}

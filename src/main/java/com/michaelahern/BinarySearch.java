package com.michaelahern;




public class BinarySearch {

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid = (high + low) / 2;

        while(low <= high) {

            if(nums[mid] == target)
                return mid;
            else if(target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (high + low) / 2;

        }

        return -1;

    }

}

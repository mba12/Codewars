package com.michaelahern;

public class JPM2 {

    // array int size n
    // integer i

   // right rotate by i;

    public int[] rotateArray(int[] nums, int i) {
        // {3,9,8,6,1}, i = 2 becomes {6,1,3,9,8}

        int[] secondArr = new int[nums.length];
        i = i % nums.length;

        int idx = 0;
        int temp = 0;
        for(int j = nums.length - 1; j > -1; j--) {
            temp = nums[j];
            nums[j] = nums[j - i];
            nums[idx + i] = temp;
            idx++;
        }

        return nums;

    }


}

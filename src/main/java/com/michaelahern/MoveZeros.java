package com.michaelahern;

public class MoveZeros {

    public void moveZeroes(int[] nums) {

        int soFar = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                soFar++;
            else
                nums[i - soFar] = nums[i];
        }

        for(int i = nums.length - soFar; i < nums.length; i++)
            nums[i] = 0;

    }

}

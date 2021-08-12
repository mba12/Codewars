package com.michaelahern;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class NextGreaterElements {

    public int[] nextGreaterElements(int[] nums) {

        int[] answer = nums.clone();

        boolean found = false;
        for(int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int index = (i + 1) % nums.length;
            found = false;
            while(index != i) {
                if(nums[index] > x) {
                    answer[i] = nums[index];
                    found = true;
                    break;
                }
                index = (index + 1) % nums.length;
            }
            if(!found) answer[i] = -1;
        }
        return answer;
    }
}

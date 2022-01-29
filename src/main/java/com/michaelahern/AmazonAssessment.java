package com.michaelahern;

import java.util.*;

public class AmazonAssessment {

    /*
    You are given an array of integers that represent the "skill" of each developer in your company. You are also given a stipulation that no team has a delta between the most and least skilled member greater than maxDiff. How many teams of size teamSize can you make given the int list given?

     */
    public static int countMaximumTeams(List<Integer> skill, int teamSize, int maxDiff) {

        Collections.sort(skill);
        System.out.println(teamSize + " :: " + maxDiff + " Input: " + Arrays.toString(skill.toArray()));
        int left = 0, right = teamSize - 1, count = 0;
        int leftVal, rightVal;
        int len = skill.size() - teamSize;
        while(left <= len && right < skill.size()) {
            leftVal = skill.get(left);
            rightVal = skill.get(right);
            if(rightVal - leftVal <= maxDiff) {
                count++;
                left += teamSize;
                right += teamSize;
            } else {
                left++;
                right++;
            }
        }

        return count;

    }



}

package com.michaelahern;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class AmazonAssessment {

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

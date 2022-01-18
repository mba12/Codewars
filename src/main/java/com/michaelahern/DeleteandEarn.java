package com.michaelahern;

import java.util.Arrays;

public class DeleteandEarn {

    public int deleteAndEarn(int[] nums) {

        if(nums.length == 1) return nums[0];

        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int [] pointMap = new int[max + 1];
        int dupeCount = 0;

        for(int i : nums) {
            pointMap[i]++;
            if(pointMap[i] > 1) dupeCount++;
        }

        int[] singles = new int[nums.length - dupeCount];
        int idx = 0;
        for(int i = 0; i < pointMap.length; i++)
            if(pointMap[i] > 0)
                singles[idx++] = i;


        int[] points = new int[singles.length];
        points[0] = singles[0] * pointMap[singles[0]];
        points[1] = singles[1] * pointMap[singles[1]];

        if(singles[1] - 1 == singles[0]) {
            points[1] = Math.max(points[0],points[1]);
        } else {
            points[1] = points[0] + points[1];
        }

        for(int i = 2; i < singles.length; i++) {
            points[i] = singles[i] * pointMap[singles[i]];
            if(singles[i] - 1 == singles[i - 1]) {
                points[i] = Math.max(points[i - 1], points[i] + points[i - 2]) ;
            } else {
                points[i] = points[i - 1] + points[i];
            }
        }

        return points[points.length - 1];
    }


/*
    Map<String, Integer> map = new HashMap<>();
    Map<String, List<Integer>> makeMap = new HashMap<>();
    int[] pointMap;
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        pointMap = new int[max + 2];
        System.out.println(Arrays.toString(nums));
        for(int i : nums)
            pointMap[i]++;

        return helper(nums);
    }

    public int helper(int[] nums) {

        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        String key = Arrays.toString(nums);
        if(map.containsKey(key))
            return map.get(key);
        // System.out.println(key);
        int points = nums[0] * pointMap[nums[0]] + helper(makeNew(nums, 0));
        // System.out.println(key + " :: " + nums.length + " :: " + 0 + " :: " + nums[0] + " localMax: " + points);
        int localMax = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                localMax = Math.max(points, (nums[i] * pointMap[nums[i]]) + helper(makeNew(nums, i)));
                // System.out.println(i + " :: " + nums[i] + " localMax: " + localMax);
                points = Math.max(points, localMax);
            }

        }
        map.put(key, points);
        return points;

    }

    public int[] makeNew(int[] nums, int j) {

        String key = Arrays.toString(nums) + ":" + nums[j];
        if(makeMap.containsKey(key)) return makeMap.get(key).stream().mapToInt(i->i).toArray();
        int count = pointMap[nums[j]] + pointMap[nums[j] + 1] + pointMap[nums[j] - 1];

        List<Integer> copy = new ArrayList(Math.max(nums.length - count, 1));
        for(int i = 0; i < j - pointMap[nums[j] - 1]; i++)
            copy.add(nums[i]);

        for(int i = j + pointMap[nums[j]] + pointMap[nums[j] + 1]; i < nums.length; i++)
            copy.add(nums[i]);

        makeMap.put(key, copy);

        return copy.stream().mapToInt(i->i).toArray();

    }

 */

}

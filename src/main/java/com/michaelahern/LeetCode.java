package com.michaelahern;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.Map;
import java.util.TreeSet;

public class LeetCode {

    public int[] addNegabinary(int[] arr1, int[] arr2) {

        int len1 = arr1.length;
        long one = tensPower(arr1);
        long two = tensPower(arr2);
        long total = one + two;
        String neg = negativeBase(total, -2l);

        int[] bitArr = new int[neg.length()];
        for(int i = 0; i < neg.length(); i++) {
            bitArr[i] = Integer.parseInt(String.valueOf(neg.charAt(i)));
        }
        return bitArr;

    }

    public String negativeBase(long integer, long base) {
        if(integer == 0) return "0";
        String result = "";
        long number = integer;
        while (number != 0) {
            long i = number % base;
            number /= base;
            if (i < 0) {
                i += Math.abs(base);
                number++;
            }

            result = i + result;
        }

        return result;
    }

    public int tensPower(int[] arr) {
        int total = 0;
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            if(arr[i] == 1)
                total += twoPower(len - 1 - i);
        }
        return total;
    }

    public int twoPower(int x) {
        int total = 1;
        if(x == 0) return 1;

        for(int i = 0; i < x; i++)
            total = total * 2;

        if(x % 2 == 0)
            return total;
        else
            return -total;
    }

    // Input: points = [[1,1],[3,4],[-1,0]]
    public int minTimeToVisitAllPoints(int[][] points) {

        int total = 0;
        int xDiff, yDiff;
        boolean yMin;

            for(int i = 0; i <= points.length - 2; i++) {
                int[] x1 = points[i];
                int[] x2 = points[i + 1];

                xDiff = Math.abs(x2[0] - x1[0]);
                yDiff = Math.abs(x2[1] - x1[1]);

                yMin = (yDiff <= xDiff);

                if(yMin) {
                    total += yDiff + (xDiff - yDiff);
                } else {
                    total += xDiff + (yDiff - xDiff);
                }
            }

        return total;

    }

    public String[] uncommonFromSentences(String A, String B) {

        Map<String, Integer> aMap = createMap(A);
        Map<String, Integer> bMap = createMap(B);
        List<String> answer = compareMaps(aMap, bMap);

        return answer.stream().toArray(String[]::new);

    }

    private List<String> compareMaps(Map<String, Integer> aMap, Map<String, Integer> bMap) {
        List<String> answer = new ArrayList<>();

        for (Map.Entry<String, Integer> item : aMap.entrySet()) {
            String key = item.getKey();
            Integer value = item.getValue();
            if(value == 1 && !bMap.containsKey(key)) {
                answer.add(key);
            }
        }

        for (Map.Entry<String, Integer> item : bMap.entrySet()) {
            String key = item.getKey();
            Integer value = item.getValue();
            if(value == 1 && !aMap.containsKey(key)) {
                answer.add(key);
            }
        }

        return answer;
    }


    private Map<String, Integer> createMap(String S) {
        String[] a = S.split(" ");
        Map<String, Integer> map = new HashMap<>();
        if(a == null || a.length == 0) return map;
        for(String s : a) {
            if(map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, (count + 1));
            } else {
                map.put(s, 1);
            }
        }

        return map;
    }

}

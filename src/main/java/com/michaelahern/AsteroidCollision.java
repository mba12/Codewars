package com.michaelahern;

import java.util.LinkedList;
import java.util.List;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {

        List<Integer> list = new LinkedList<>();

        for(int i : asteroids)
            list.add(i);

        if(asteroids.length <= 1) return asteroids;

        int left, right;
        int idx = 0;
        boolean flip = false;
        while(list.size() > 1) {
            left = list.get(idx);
            right = list.get(idx + 1);
            if(left > 0 && right > 0) {
                idx++;
            } else if(left < 0 && right < 0) {
                idx++;
            } else if (left < 0 && right > 0) {
                idx++;
            } else if (left == (-right) ) {
                list.remove(idx);
                list.remove(idx);
                if(idx > 0)
                    idx--;

            } else {
                if(left > 0) {
                    if(left > (-right)) {
                        list.remove(idx + 1);
                    } else {
                        list.remove(idx);
                    }
                } else {
                    if((-left) > right) {
                        list.remove(idx + 1);
                    } else {
                        list.remove(idx);
                    }
                }
                if(idx > 0)
                    idx--;
            }
            if(idx >= list.size() - 1) {
                break;
            }
        }
        int[] ret = new int[list.size()];
        for(int i = 0;i < ret.length;i++)
            ret[i] = list.get(i);
        return ret;

    }


}

package com.michaelahern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoinChange {

    int [] c = null;
    Map<Integer, Integer> map = new HashMap<>();
    public int coinChange(int[] coins, int amount) {
        if (amount <= 0) return 0;

        Arrays.sort(coins);
        for(int i = 0; i < coins.length/2; i++) {
            int temp = coins[i];
            coins[i] = coins[coins.length - 1 - i];
            coins[coins.length - 1 - i] = temp;
        }

        c = coins;

        int count = dfs(amount);
        return count;

    }

    public int dfs(int remaining) {

        if(remaining == 0) return 0;
        if(remaining < 0) return -1;

        if(map.containsKey(remaining)) {
            return map.get(remaining);
        }

        int min = Integer.MAX_VALUE;
        boolean match = false;
        for(int i = 0; i < c.length; i++) {
            int value = dfs(remaining - c[i]);
            if(value >= 0 && value < min) {
                min = value + 1;
                match = true;
            }
        }
        if(match) {
            map.put(remaining, min);
        } else {
            map.put(remaining, -1);
        }

        return match ? min : -1;
    }

    Map<Integer,Integer> amountDict = new HashMap<Integer,Integer>();
    public int coinChange2(int[] coins, int amount) {
        if(amount==0)
            return 0;
        if(amountDict.containsKey(amount))
            return amountDict.get(amount);
        int n = amount+1;
        for(int coin : coins) {
            int curr = 0;
            if (amount >= coin) {
                int next = coinChange(coins, amount-coin);
                if(next >= 0)
                    curr = 1+next;
            }
            if(curr > 0)
                n = Math.min(n,curr);
        }
        int finalCount = (n==amount+1) ? -1 : n;
        amountDict.put(amount,finalCount);
        return finalCount;
    }

    public int coinChange3(int[] coins, int amount) {
        if(amount<1) return 0;
        return helper(coins, amount, new int[amount]);
    }

    private int helper(int[] coins, int rem, int[] count) { // rem: remaining coins after the last step; count[rem]: minimum number of coins to sum up to rem
        if(rem<0) return -1; // not valid
        if(rem==0) return 0; // completed
        if(count[rem-1] != 0) return count[rem-1]; // already computed, so reuse
        int min = Integer.MAX_VALUE;
        for(int coin : coins) {
            int res = helper(coins, rem-coin, count);
            if(res>=0 && res < min)
                min = 1+res;
        }
        count[rem-1] = (min==Integer.MAX_VALUE) ? -1 : min;
        return count[rem-1];
    }

}

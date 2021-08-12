package com.michaelahern;

import java.util.PriorityQueue;

class KthLargest {
    int k;
    private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {

        this.k = k;
        for(int i : nums) {
            minHeap.add(i);
        }
        while(minHeap.size() > k) {
            minHeap.poll();
        }

    }

    public int add(int val) {
        int answer;
        minHeap.add(val);
        if(minHeap.size() > k) {
            minHeap.poll();
        }
        answer = minHeap.peek();
        return answer;
    }
}

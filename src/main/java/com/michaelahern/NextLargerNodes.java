package com.michaelahern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextLargerNodes {

    public int[] nextLargerNodes(ListNode head) {

        int idx = 0;
        ListNode next = head;

        while(next != null) {
            idx++;
            next = next.next;
        }
        int[] list = new int[idx];
        int[] answer = new int[idx];

        next = head;
        idx = 0;
        while(next != null) {
            list[idx] = next.val;
            idx++;
            next = next.next;
        }

        for(int i = 0; i < list.length; i++) {
            for(int j = i + 1; j < list.length; j++) {
                if(list[j] > list[i]) {
                    answer[i] = list[j];
                    break;
                }
           }
        }

        return answer;
    }


}

package com.michaelahern;

import java.util.HashMap;
import java.util.Map;

public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        Map<Integer, ListNode> map = new HashMap<>();

        map.put(1, head);
        ListNode tempHead = head;
        ListNode next = head;
        int count = 1;
        while(next.next != null) {
            next = next.next;
            count++;
            map.put(count, next);
        }

        int deleteNodeIdx = count - n;
        if(deleteNodeIdx == 0 && count > 1) {
            return tempHead.next;
        } else if (deleteNodeIdx == 0 && count == 1) {
            return null;
        }

        ListNode pre = map.get(deleteNodeIdx);
        if(pre.next != null) {
            pre.next = pre.next.next;
        }

        return tempHead;

    }
}

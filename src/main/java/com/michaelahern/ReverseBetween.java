package com.michaelahern;

import java.util.Stack;

public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode next = head;
        ListNode sortStart = null;
        ListNode sortEnd = null;
        Stack<ListNode> stack = new Stack<>();
        int count = 1;
        while(next != null && count <= right) {

            if(count == 1 && left == 1) {
                sortStart = null;
            } else if(count == left - 1)
                sortStart = next;

            if(count == right && next.next == null)
                sortEnd = null;
            else if(count == right)
                sortEnd = next.next;

            if(count >= left && count <= right)
                stack.push(next);

            count++;
            next = next.next;
        }

        while(!stack.isEmpty()) {
            ListNode node = stack.pop();
            if(sortStart == null)
                head = sortStart = node;
            else {
                sortStart.next = node;
                sortStart = sortStart.next;
            }
        }

        sortStart.next = sortEnd;
        return head;

    }
}

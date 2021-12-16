package com.michaelahern;

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        if(head.next.next == null) {
            ListNode temp1 = head;
            ListNode temp2 = head.next;
            temp2.next = head;
            temp1.next = null;
            return temp2;
        }

        if(head.next.next != null) {
            ListNode temp2 = head.next;
            head.next = head.next.next;
            temp2.next = head;
            head = temp2;
        }
        ListNode next = head.next;


        while(next != null && next.next != null && next.next.next != null) {
            ListNode temp1 = next.next;
            ListNode temp2 = next.next.next;
            temp1.next = temp2.next;
            next.next = temp2;
            temp2.next = temp1;
            if(next.next != null) next = next.next.next;

        }

        return head;
    }
}

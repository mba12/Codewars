package com.michaelahern;

public class MiddleNode {

    public ListNode middleNode(ListNode head) {

        ListNode temp = head;

        int count = 0, mid = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }

        mid = count / 2;

        temp = head;
        count = 0;
        while(temp != null) {
            if (count == mid) return temp;
            count++;
            temp = temp.next;
        }
        return head;
    }
}

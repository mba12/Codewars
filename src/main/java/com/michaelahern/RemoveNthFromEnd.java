package com.michaelahern;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode[] arr = new ListNode[31];

        arr[1] = head;
        ListNode tempHead = head;
        ListNode next = head;
        int count = 1;
        while(next.next != null) {
            next = next.next;
            count++;
            arr[count] = next;
        }

        int deleteNodeIdx = count - n;
        if(deleteNodeIdx == 0 && count > 1) {
            return tempHead.next;
        } else if (deleteNodeIdx == 0 && count == 1) {
            return null;
        }

        ListNode pre = arr[deleteNodeIdx];
        if(pre.next != null) {
            pre.next = pre.next.next;
        }

        return tempHead;

    }
}

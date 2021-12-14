package com.michaelahern;

public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;
        if(head.next == null) return head;

        ListNode previous = head;
        ListNode current = head.next;
        int value = 0;
        while( previous != null && current != null && previous.val == current.val) {
            value = previous.val;
            while(previous != null && previous.val == value) {
                previous = previous.next;
            }
            head = previous;
            if(previous != null)
                current = previous.next;

        }

        boolean flag;
        while(previous != null) {
            flag = false;
            if(current != null && current.next != null && current.val == current.next.val) {
                value = current.val;
                while(current != null && current.val == value) {
                    previous.next = current.next;
                    current = current.next;
                }
                flag = true;
            }

            if(!flag) {
                previous = previous.next;
                if(current != null)
                    current = current.next;
            }

        }
        return head;
    }
}

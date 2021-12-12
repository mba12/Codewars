package com.michaelahern;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class SortList {

    public ListNode sortList(ListNode head) {

        ListNode list = head;
        if(head == null || head.next == null) return head;

        int count = -1;
        while(list != null) {
            count++;
            list = list.next;
        }
        list = head;
        count++;
        ListNode[] pointers = new ListNode[count];
        int idx = 0;
        while(list != null && idx < count) {
            pointers[idx] = list;
            list = list.next;
            pointers[idx].next = null;
            idx++;
        }

        ListNode[] test = helper(pointers);
        while(test.length >= 2) {
            test = helper(test);
        }

        return test[0];
    }

    public ListNode[] helper(ListNode[] pointers) {

        int length;
        if(pointers.length % 2 == 1) {
            int len = pointers.length - 1;
            pointers[len - 1] = helper2(pointers[len - 1], pointers[len]);
            length = pointers.length - 2;
        } else {
            length = pointers.length - 1;
        }

        ListNode[] head = new ListNode[pointers.length / 2];

        for(int i = 0, j = 0; i < length; i = i + 2, j++) {
            head[j] = helper2(pointers[i], pointers[i + 1]);
        }
        return head;
    }

    private ListNode helper2(ListNode one, ListNode two) {
        ListNode halfList = null;
        ListNode head = null;

        while(one != null && two != null) {
            if(one.val < two.val) {
                if(halfList == null) {
                    halfList = one;
                    head = halfList;
                } else {
                    halfList.next = one;
                    halfList = halfList.next;
                }
                one = one.next;
            } else {
                if(halfList == null) {
                    halfList = two;
                    head = halfList;
                } else {
                    halfList.next = two;
                    halfList = halfList.next;
                }
                two = two.next;
            }
        }
        while(one != null) {
            if(halfList == null) {
                halfList = one;
            } else {
                halfList.next = one;
                halfList = halfList.next;
            }
            one = one.next;
        }
        while(two != null) {
            if(halfList == null) {
                halfList = two;
            } else {
                halfList.next = two;
                halfList = halfList.next;
            }
            two = two.next;
        }

        return head;
    }

}

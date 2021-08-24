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
        if(head == null) return head;

        int count = -1;
        while(list != null) {
            count++;
            list = list.next;
        }
        list = head;

        ListNode[] pointers = new ListNode[++count];
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
        ListNode[] halfList = new ListNode[pointers.length / 2];
        ListNode[] head = new ListNode[pointers.length / 2];
        boolean oddNumber = pointers.length % 2 == 1;
        for(int i = 0, j = 0; i < pointers.length - 1; i = i + 2, j++) {

            head[j] = helper2(pointers[i], pointers[i + 1]);
            ListNode test = head[j];
            System.out.print("J " + j + ": ");
            while(test.next != null) {
                System.out.print(test.val + ", ");
                test = test.next;
            }
            System.out.print("\n"  );
            /*
            while(pointers[i] != null && pointers[i + 1] != null) {
                if(pointers[i].val < pointers[i + 1].val) {
                    if(halfList[j] == null) {
                        halfList[j] = pointers[i];
                        head[j] = halfList[j];
                    } else {
                        halfList[j].next = pointers[i];
                        halfList[j] = halfList[j].next;
                    }
                    pointers[i] = pointers[i].next;
                } else {
                    if(halfList[j] == null) {
                        halfList[j] = pointers[i + 1];
                        head[j] = halfList[j];
                    } else {
                        halfList[j].next = pointers[i + 1];
                        halfList[j] = halfList[j].next;
                    }
                    pointers[i + 1] = pointers[i + 1].next;
                }
            }
            while(pointers[i] != null) {
                if(halfList[j] == null) {
                    halfList[j] = pointers[i];
                } else {
                    halfList[j].next = pointers[i];
                    halfList[j] = halfList[j].next;
                }
                pointers[i] = pointers[i].next;
            }
            while(pointers[i + 1] != null) {
                if(halfList[j] == null) {
                    halfList[j] = pointers[i + 1];
                } else {
                    halfList[j].next = pointers[i + 1];
                    halfList[j] = halfList[j].next;
                }
                pointers[i + 1] = pointers[i + 1].next;
            }

             */
            if(oddNumber && i < pointers.length - 3) {
                head[j] = helper2(head[j], pointers[i + 2]);
            }
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

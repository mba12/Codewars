package com.michaelahern;

public class PrintLinkedListInReverse {


    public void printLinkedListInReverse(ImmutableListNode head) {

        if(head == null) return;

        printLinkedListInReverse(head.getNext());
        head.printValue();
    }

}

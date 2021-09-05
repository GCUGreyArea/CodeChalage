package com.genesis;

public class NodeListFactory {
    ListNode head;
    ListNode tail;
    int size;

    public NodeListFactory() {
        head = null;
        tail = null;
        size = 0;
    }

    public ListNode getHead() {
        return this.head;
    }

    public ListNode makeList(int size) {
        this.head = null;
        this.tail = null;
        this.size = 0;

        for(int i=0;i<size;i++) {
            tail = addTail();
        }

        return this.head;
    }

    private ListNode addTail() {
        if(this.size == 0) {
            this.head = new ListNode(++size);
            this.tail = this.head;
        }
        else {
            tail = tail.addTail(++size);
        }

        return tail;
    }
}

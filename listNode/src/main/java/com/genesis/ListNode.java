package com.genesis;

public class ListNode {
    public final int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode getNext() {
        return this.next;
    }

    public void setNext(ListNode node) {
        this.next = node;
    }

    public ListNode addTail(int val) {
        this.next = new ListNode(val);

        return this.next;
    }

    public int getValue() {
        return this.val;
    }

    public int [] toArray() {
        int size = 0;
        ListNode n = this;
        while(n != null) {
            size++;
            n = n.next;
        }

        int [] arr = new int[size];
        n = this;
        int pos=0;
        while(n != null) {
            arr[pos++] = n.getValue();
            n = n.next;
        }

        return arr;
    }

}
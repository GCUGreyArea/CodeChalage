package com.genesis;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        ListNode localhead = head;

        ListNode index = head;
        ListNode last = head;

        // Get the length of the list
        int len=0;
        while(index != null) {
            len++;
            index = index.next;
        }

        // There's only one element
        if(len == 1 && n == 1) return null;

        // Reset next;
        index=localhead;

        // Get the place in the list we want to prune
        int place = len-n;

        // If it's the first place the solution is to move the head of teh list up
        if(place == 0) {
            localhead = localhead.next;
        }
        else {
            for(int i=0;i<place;i++) {
                last = index;
                index = index.next;
            }

            // Last should now point to the list item before the one we want
            // And index should be the one we want
            if(last != null && index != null) {
                last.next = index.next;
            }
        }

        // Return our copy of the head of the list
        return localhead;
    }
}
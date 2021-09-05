package com.genesis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestSolution {
    private final Solution sol = new Solution();

    boolean areEqual(int [] ar1, int [] ar2) {
        if(ar1.length != ar2.length) return false;


        for(int i=0;i<ar1.length;i++) {
            if(ar1[i] != ar2[i]) return false;
        }

        return true;
    }

    @Test
    public void shouldAnswerWithTrue() {
        NodeListFactory l1 = new NodeListFactory();

        ListNode node = l1.makeList(10);
        int [] arr = node.toArray();
        int [] exp = {1,2,3,4,5,6,7,8,9,10};

        assertEquals(10,arr.length);
        assertTrue(areEqual(exp,arr));


        node = sol.removeNthFromEnd(node, 2);
        arr = node.toArray();
        exp = new int[] {1,2,3,4,5,6,7,8,10};

        assertEquals(9,arr.length);
        assertTrue(areEqual(exp,arr));
    }
}

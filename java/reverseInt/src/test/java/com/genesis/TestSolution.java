package com.genesis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestSolution {
    private final Solution sol = new Solution();

    @Test
    public void testThatSolutionGivesPredictableResults() {
        int val = sol.reverse(123);

        assertEquals(321,val);

        val = sol.reverse(19657);
        assertEquals(75691,val);

        val = sol.reverse(0);
        assertEquals(0,val);

        val = sol.reverse(1);
        assertEquals(1,val);


        val = sol.reverse(-1);
        assertEquals(-1,val);


        val = sol.reverse(-12345);
        assertEquals(-54321,val);

        val = sol.reverse(-9245682);
        assertEquals(-2865429, val);

        val = sol.reverse(1534236469);
        assertEquals(0,val);
    }
}

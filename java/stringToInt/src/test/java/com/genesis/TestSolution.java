package com.genesis;

import static org.junit.jupiter.api.Assertions.assertEquals;

// import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestSolution
{
    private final Solution sol = new Solution();

    @Test
    public void testThatSolutionConvertsStringsToInts() {
        String str = "1234";
        int val = sol.myAtoi(str);
        assertEquals(1234,val);

        str = "0000";
        val = sol.myAtoi(str);
        assertEquals(0,val);

        str = " 01";
        val = sol.myAtoi(str);
        assertEquals(1,val);

        str = "-12";
        val = sol.myAtoi(str);
        assertEquals(-12,val);

        str = "  -12";
        val = sol.myAtoi(str);
        assertEquals(-12,val);

        str = "+4567";
        val = sol.myAtoi(str);
        assertEquals(4567,val);

        str = "   +4567";
        val = sol.myAtoi(str);
        assertEquals(4567,val);

        str = "2147483647";
        val = sol.myAtoi(str);
        assertEquals(2147483647,val);

        str = "-2147483648";
        val = sol.myAtoi(str);
        assertEquals(-2147483648,val);

        str = "-2147483648 number";
        val = sol.myAtoi(str);
        assertEquals(-2147483648,val);

        str = "2147483648";
        val = sol.myAtoi(str);
        assertEquals(2147483647,val);

        str = "  -12 and some words";
        val = sol.myAtoi(str);
        assertEquals(-12,val);
    }
}

package com.genesis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * Unit test for simple App.
 */
public class SolutionTest
{
    private final Solution sol = new Solution();
    private final Random rand = new Random();

    int getRandomNumber(int bond) {
        assertNotEquals(0, bond);

        int number = 0;
        while(number == bond || number == 0) {
            number = rand.nextInt(bond);
        }

        return number;
    }

    int [] generateRandomArrays(int size, int target) {
        int [] arr = new int[size];

        int factor = getRandomNumber(target);
        int sub = target - factor;

        arr[0] = factor;
        arr[1] = sub;

        // Add extra ints
        for(int i=2;i<size;i++) {
            arr[i] = rand.nextInt(target) + target;
        }

        return arr;
    }

    void shuffle(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    int findNumberLessThan(int [] arr, int number, int from) {
        for(int i=from;i<arr.length;i++) {
            if(arr[i] < number) return i;
        }
        return -1;
    }

    void printArray(int [] array) {
        System.out.printf("[ ");
        for(int i : array) {
            System.out.printf("%d ",i);
        }
        System.out.println("]");
    }

    boolean constains(int [] arr, int value) {
        for(int i : arr) {
            if(i == value) return true;
        }

        return false;
    }

    @Test
    public void testRationalRandomArrayCanBeCreated() {
        int [] newSet = generateRandomArrays(1000,25);
        int f1 = newSet[0];
        int f2 = newSet[1];

        shuffle(newSet);

        assertTrue(constains(newSet,f1));
        assertTrue(constains(newSet,f2));

        int p1 = findNumberLessThan(newSet,25,0);
        int p2 = findNumberLessThan(newSet,25,p1+1);

        assertNotEquals(-1, p1);
        assertNotEquals(-1, p2);

        assertEquals(25,newSet[p1] + newSet[p2]);

        int [] arr = sol.twoSum(newSet,25);
        assertEquals(25,newSet[arr[0]] + newSet[arr[1]]);
    }

    @Test
    public void testThatSolutionGivesPredictableResults() {
        // Simple test
        int [] set = {1,2,3,4,5,6,7,8,9,10};
        int [] arr = sol.twoSum(set,3);
        assertTrue(arr.length == 2);
        assertEquals(0,arr[0]);
        assertEquals(1,arr[1]);


        arr = sol.twoSum(set,19);
        assertTrue(arr.length == 2);
        assertEquals(8,arr[0]);
        assertEquals(9,arr[1]);

        // Run more complex tests
        for(int i=0; i<100;i++) {
            int number = getRandomNumber(1024);
            int [] newSet = generateRandomArrays(1000,number);
            shuffle(newSet);

            arr = sol.twoSum(newSet,number);
            assertTrue(arr.length == 2);
            int p1 = arr[0];
            int p2 = arr[1];

            int result = newSet[p1] + newSet[p2];
            assertEquals(number,result);
        }
    }
}

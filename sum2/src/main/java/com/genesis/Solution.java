package com.genesis;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] retVal = new int[2];

        // Add your code here
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++) {
                if(i != j && nums[i] + nums[j] == target) {

                    retVal[0] = i;
                    retVal[1] = j;

                    return retVal;
                }
            }
        }

        return retVal;
    }
}

#include <stdio.h>
#include <stdlib.h>


#include "libsum2.h"

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    for(int i=0;i<numsSize;i++) {
        for(int j=0;j<numsSize;j++) {
            if(i != j && nums[i] + nums[j] == target) {
                int * retVal = malloc(sizeof(int) * 2);
                if(retVal == NULL) {
                    fprintf(stderr,"Memeory allocation failure\n");
                    abort();
                }

                retVal[0] = i;
                retVal[1] = j;
                *returnSize = 2;

                return retVal;
            }
        }
    }

    *returnSize = 0;
    return NULL;
}

#include <gtest/gtest.h>

#ifdef __cplusplus
extern "C"{
#endif

/**
 * @file test_sum2.cpp
 * @author Barry Robinson (barry.robinson@genesistechsys.com)
 * @brief
 * @version 0.1
 * @date 2021-09-06
 *
 * @copyright Copyright (c) 2021
 *
 */
#include <libsum2.h>

#ifdef __cplusplus
}
#endif

TEST(testSum2, testThatSumtTwoReturnsValidValues) {
    int set[] = {1,2,3,4,5,6,7,8,9,10};
    int ret=0;
    int * arr = twoSum(set,10,3,&ret);

    EXPECT_TRUE(arr != NULL);
    EXPECT_EQ(0,arr[0]);
    EXPECT_EQ(1,arr[1]);
}
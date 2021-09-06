#include <gtest/gtest.h>
/**
 * @brief Main function for test harness
 *
 * @param argc
 * @param argv
 * @return int
 */
int main(int argc, const char ** argv) {
    testing::InitGoogleTest(&argc, (char**) argv);
    return RUN_ALL_TESTS();
}

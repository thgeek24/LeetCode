/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w427;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/08 11:37
 */
class MaximumSubarraySumWithLengthDivisibleByKTest {
    private MaximumSubarraySumWithLengthDivisibleByK test;

    @BeforeEach
    void setUp() {
        test = new MaximumSubarraySumWithLengthDivisibleByK();
    }

    @Test
    void test1() {
        int[] nums = {1, 2};
        int k = 1;
        assertEquals(3, test.maxSubarraySum(nums, k));
    }

    @Test
    void test2() {
        int[] nums = {-1, -2, -3, -4, -5};
        int k = 4;
        assertEquals(-10, test.maxSubarraySum(nums, k));
    }

    @Test
    void test3() {
        int[] nums = {-5, 1, 2, -3, 4};
        int k = 2;
        assertEquals(4, test.maxSubarraySum(nums, k));
    }
}
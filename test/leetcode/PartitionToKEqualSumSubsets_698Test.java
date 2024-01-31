/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/31 16:37
 */
class PartitionToKEqualSumSubsets_698Test {

    private PartitionToKEqualSumSubsets_698 test;

    @BeforeEach
    void setUp() {
        test = new PartitionToKEqualSumSubsets_698();
    }

    @Test
    void can() {
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        assertTrue(test.canPartitionKSubsets(nums, k));
    }

    @Test
    void canNot() {
        int[] nums = {1, 2, 3, 4};
        int k = 3;
        assertFalse(test.canPartitionKSubsets(nums, k));
    }
}
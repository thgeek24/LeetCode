/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m416;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link PartitionEqualSubsetSum}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/18 10:32
 */
class PartitionEqualSubsetSum_Test {
    private PartitionEqualSubsetSum test;

    @BeforeEach
    void setUp() {
        test = new PartitionEqualSubsetSum();
    }

    @Test
    void can() {
        int[] nums = {1, 5, 11, 5};
        assertTrue(test.canPartition(nums));
    }

    @Test
    void can_1() {
        int[] nums = {3, 3, 3, 4, 5};
        assertTrue(test.canPartition(nums));
    }

    @Test
    void can_2() {
        int[] nums = {14, 9, 8, 4, 3, 2};
        assertTrue(test.canPartition(nums));
    }

    @Test
    void canNot() {
        int[] nums = {1, 2, 3, 5};
        assertFalse(test.canPartition(nums));
    }
}
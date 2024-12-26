/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m494;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link TargetSum}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/22 09:57
 */
class TargetSumTest {
    private TargetSum test;

    @BeforeEach
    void setUp() {
        test = new TargetSum();
    }

    @Test
    void equalsFive() {
        int[] nums = {1, 1, 1, 1, 1};
        assertEquals(5, test.findTargetSumWays(nums, 3));
    }

    @Test
    void equalsOne() {
        int[] nums = {1};
        assertEquals(1, test.findTargetSumWays(nums, 1));
    }
}
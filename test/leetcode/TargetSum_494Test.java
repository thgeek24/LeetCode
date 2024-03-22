/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link TargetSum_494}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/22 09:57
 */
class TargetSum_494Test {
    private TargetSum_494 test;

    @BeforeEach
    void setUp() {
        test = new TargetSum_494();
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
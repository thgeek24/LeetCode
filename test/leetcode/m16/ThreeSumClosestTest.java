/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ThreeSumClosest}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/30 14:08
 */
class ThreeSumClosestTest {
    private ThreeSumClosest test;

    @BeforeEach
    void setUp() {
        test = new ThreeSumClosest();
    }

    @Test
    void equalsMinusTwo() {
        int[] nums = {4, 0, 5, -5, 3, 3, 0, -4, -5};
        int target = -2;
        int expected = -2;
        assertEquals(expected, test.threeSumClosest(nums, target));
    }
}
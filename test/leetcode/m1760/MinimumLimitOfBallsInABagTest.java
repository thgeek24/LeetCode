/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1760;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MinimumLimitOfBallsInABag}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/07 08:41
 */
class MinimumLimitOfBallsInABagTest {
    private MinimumLimitOfBallsInABag test;

    @BeforeEach
    void setUp() {
        test = new MinimumLimitOfBallsInABag();
    }

    @Test
    void equalsThree() {
        int[] nums = {9};
        int maxOperations = 2;
        assertEquals(3, test.minimumSize(nums, maxOperations));
    }

    @Test
    void equalsTwo() {
        int[] nums = {2, 4, 8, 2};
        int maxOperations = 4;
        assertEquals(2, test.minimumSize(nums, maxOperations));
    }
}
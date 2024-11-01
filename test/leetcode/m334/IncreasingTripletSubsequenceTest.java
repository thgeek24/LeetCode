/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m334;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link IncreasingTripletSubsequence}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/29 23:04
 */
class IncreasingTripletSubsequenceTest {
    private IncreasingTripletSubsequence test;

    @BeforeEach
    void setUp() {
        test = new IncreasingTripletSubsequence();
    }

    @Test
    void isTrue() {
        int[] nums = {1, 2, 3, 4, 5};
        assertTrue(test.increasingTriplet(nums));
    }

    @Test
    void isFalse() {
        int[] nums = {5, 4, 3, 2, 1};
        assertFalse(test.increasingTriplet(nums));
    }

    @Test
    void isTrue2() {
        int[] nums = {2, 1, 5, 0, 4, 6};
        assertTrue(test.increasingTriplet(nums));
    }

    @Test
    void isTrue3() {
        int[] nums = {20, 100, 10, 12, 5, 13};
        assertTrue(test.increasingTriplet(nums));
    }
}
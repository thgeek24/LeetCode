/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link DivideArrayInSetsOfKConsecutiveNumbers_1296}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/03 09:53
 */
class DivideArrayInSetsOfKConsecutiveNumbers_1296Test {
    private DivideArrayInSetsOfKConsecutiveNumbers_1296 test;

    @BeforeEach
    void setUp() {
        test = new DivideArrayInSetsOfKConsecutiveNumbers_1296();
    }

    @Test
    void isTrue() {
        int[] nums = {1, 2, 3, 3, 4, 4, 5, 6};
        int k = 4;
        assertTrue(test.isPossibleDivide(nums, k));
    }

    @Test
    void isTrue2() {
        int[] nums = {3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11};
        int k = 3;
        assertTrue(test.isPossibleDivide(nums, k));
    }

    @Test
    void isFalse() {
        int[] nums = {1, 2, 3, 4};
        int k = 3;
        assertFalse(test.isPossibleDivide(nums, k));
    }
}
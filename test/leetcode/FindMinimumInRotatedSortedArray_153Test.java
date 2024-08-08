/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link FindMinimumInRotatedSortedArray_153}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/08 11:47
 */
class FindMinimumInRotatedSortedArray_153Test {
    private FindMinimumInRotatedSortedArray_153 test;

    @BeforeEach
    void setUp() {
        test = new FindMinimumInRotatedSortedArray_153();
    }

    @Test
    void equalsOne() {
        int[] nums = {3, 4, 5, 1, 2};
        assertEquals(1, test.findMin(nums));
    }

    @Test
    void equalsOne2() {
        int[] nums = {2, 1};
        assertEquals(1, test.findMin(nums));
    }

    @Test
    void equalsZero() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, test.findMin(nums));
    }

    @Test
    void equalsEleven() {
        int[] nums = {11, 13, 15, 17};
        assertEquals(11, test.findMin(nums));
    }
}
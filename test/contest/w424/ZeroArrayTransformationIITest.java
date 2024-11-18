/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w424;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link ZeroArrayTransformationII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/17 12:02
 */
class ZeroArrayTransformationIITest {
    private ZeroArrayTransformationII test;

    @BeforeEach
    void setUp() {
        test = new ZeroArrayTransformationII();
    }

    @Test
    void equalsTwo() {
        int[] nums = {2, 0, 2};
        int[][] queries = {{0, 2, 1}, {0, 2, 1}, {1, 1, 3}};
        int expected = 2;
        assertEquals(expected, test.minZeroArray(nums, queries));
    }

    @Test
    void equalsMinusOne() {
        int[] nums = {4, 3, 2, 1};
        int[][] queries = {{1, 3, 2}, {0, 2, 1}};
        int expected = -1;
        assertEquals(expected, test.minZeroArray(nums, queries));
    }

    @Test
    void equalsZero() {
        int[] nums = {0};
        int[][] queries = {{0, 0, 2}, {0, 0, 4}, {0, 0, 4}, {0, 0, 3}, {0, 0, 5}};
        int expected = 0;
        assertEquals(expected, test.minZeroArray(nums, queries));
    }
}
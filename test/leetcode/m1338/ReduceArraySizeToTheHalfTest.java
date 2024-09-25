/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1338;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ReduceArraySizeToTheHalf}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/15 12:53
 */
class ReduceArraySizeToTheHalfTest {
    private ReduceArraySizeToTheHalf test;

    @BeforeEach
    void setUp() {
        test = new ReduceArraySizeToTheHalf();
    }

    @Test
    void equalsTwo() {
        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        int expected = 2;
        assertEquals(expected, test.minSetSize(arr));
    }

    @Test
    void equalsOne() {
        int[] arr = {7, 7, 7, 7, 7, 7};
        int expected = 1;
        assertEquals(expected, test.minSetSize(arr));
    }

    @Test
    void equalsOne2() {
        int[] arr = {1, 9};
        int expected = 1;
        assertEquals(expected, test.minSetSize(arr));
    }
}
/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SortColors}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/05 11:00
 */
class SortColorsTest {
    private SortColors test;

    @BeforeEach
    void setUp() {
        test = new SortColors();
    }

    @Test
    void test1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        test.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test2() {
        int[] nums = {2, 0, 1};
        int[] expected = {0, 1, 2};
        test.sortColors(nums);
        assertArrayEquals(expected, nums);
    }
}
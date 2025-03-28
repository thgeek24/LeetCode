/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e349;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link IntersectionOfTwoArrays}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/28 08:32
 */
class IntersectionOfTwoArraysTest {
    private IntersectionOfTwoArrays test;

    @BeforeEach
    void setUp() {
        test = new IntersectionOfTwoArrays();
    }

    @Test
    void test1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expected = {2};
        int[] actual = test.intersection(nums1, nums2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] expected = {9, 4};
        int[] actual = test.intersection(nums1, nums2);
        assertArrayEquals(expected, actual);
    }
}
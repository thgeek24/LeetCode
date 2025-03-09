/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ContainerWithMostWater}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/03 13:12
 */
class ContainerWithMostWaterTest {
    private ContainerWithMostWater test;

    @BeforeEach
    void setUp() {
        test = new ContainerWithMostWater();
    }

    @Test
    void test1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        assertEquals(expected, test.maxArea(height));
    }

    @Test
    void test2() {
        int[] height = {1, 1};
        int expected = 1;
        assertEquals(expected, test.maxArea(height));
    }

    @Test
    void test3() {
        int[] height = {8, 7, 2, 1};
        int expected = 7;
        assertEquals(expected, test.maxArea(height));
    }

    @Test
    void test4() {
        int[] height = {3, 6, 1};
        int expected = 3;
        assertEquals(expected, test.maxArea(height));
    }
}
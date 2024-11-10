/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h84;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link LargestRectangleInHistogram}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 00:32
 */
class LargestRectangleInHistogramTest {
    private LargestRectangleInHistogram test;

    @BeforeEach
    void setUp() {
        test = new LargestRectangleInHistogram();
    }

    @Test
    void equalsTen() {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int expected = 10;
        assertEquals(expected, test.largestRectangleArea(heights));
    }

    @Test
    void equalsFour() {
        int[] heights = {2, 4};
        int expected = 4;
        assertEquals(expected, test.largestRectangleArea(heights));
    }

    @Test
    void equalsTwelve() {
        int[] heights = {6, 5, 4, 3, 2};
        int expected = 12;
        assertEquals(expected, test.largestRectangleArea(heights));
    }

    @Test
    void equalsSix() {
        int[] heights = {4, 3, 1};
        int expected = 6;
        assertEquals(expected, test.largestRectangleArea(heights));
    }

    @Test
    void equalsFifteen() {
        int[] heights = {5, 6, 7};
        int expected = 15;
        assertEquals(expected, test.largestRectangleArea(heights));
    }
}
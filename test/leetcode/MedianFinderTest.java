/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link MedianFinder}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/27 11:18
 */
class MedianFinderTest {
    private MedianFinder test;

    @BeforeEach
    void setUp() {
        test = new MedianFinder();
    }

    @Test
    void test1() {
        test.addNum(1);
        test.addNum(2);
        assertEquals(1.5, test.findMedian());
        test.addNum(3);
        assertEquals(2.0, test.findMedian());
    }

    @Test
    void test2() {
        test.addNum(-1);
        assertEquals(-1, test.findMedian());
        test.addNum(-2);
        assertEquals(-1.5, test.findMedian());
        test.addNum(-3);
        assertEquals(-2.0, test.findMedian());
        test.addNum(-4);
        assertEquals(-2.5, test.findMedian());
        test.addNum(-5);
        assertEquals(-3.0, test.findMedian());
    }
}
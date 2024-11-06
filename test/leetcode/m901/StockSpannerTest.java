/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m901;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link StockSpanner}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/07 00:31
 */
class StockSpannerTest {
    private StockSpanner test;

    @BeforeEach
    void setUp() {
        test = new StockSpanner();
    }

    @Test
    void test() {
        assertEquals(1, test.next(100));
        assertEquals(1, test.next(80));
        assertEquals(1, test.next(60));
        assertEquals(2, test.next(70));
        assertEquals(1, test.next(60));
        assertEquals(4, test.next(75));
        assertEquals(6, test.next(85));
    }
}
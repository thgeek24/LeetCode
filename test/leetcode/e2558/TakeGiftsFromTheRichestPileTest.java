/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e2558;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link TakeGiftsFromTheRichestPile}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/12 09:01
 */
class TakeGiftsFromTheRichestPileTest {
    private TakeGiftsFromTheRichestPile test;

    @BeforeEach
    void setUp() {
        test = new TakeGiftsFromTheRichestPile();
    }

    @Test
    void test1() {
        int[] gifts = {25, 64, 9, 4, 100};
        int k = 4;
        int expected = 29;
        assertEquals(expected, test.pickGifts(gifts, k));
    }

    @Test
    void test2() {
        int[] gifts = {1, 1, 1, 1};
        int k = 4;
        int expected = 4;
        assertEquals(expected, test.pickGifts(gifts, k));
    }
}
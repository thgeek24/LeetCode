/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h123;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link BestTimeToBuyAndSellStockIII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/01 10:06
 */
class BestTimeToBuyAndSellStockIIITest {
    private BestTimeToBuyAndSellStockIII test;

    @BeforeEach
    void setUp() {
        test = new BestTimeToBuyAndSellStockIII();
    }

    @Test
    void equalsSix() {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        int expected = 6;
        assertEquals(expected, test.maxProfit(prices));
    }

    @Test
    void equalsFour() {
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;
        assertEquals(expected, test.maxProfit(prices));
    }

    @Test
    void equalsZero() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        assertEquals(expected, test.maxProfit(prices));
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h188;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link BestTimeToBuyAndSellStockIV}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/04 07:13
 */
class BestTimeToBuyAndSellStockIVTest {
    private BestTimeToBuyAndSellStockIV test;

    @BeforeEach
    void setUp() {
        test = new BestTimeToBuyAndSellStockIV();
    }

    @Test
    void equalsTwo() {
        int k = 2;
        int[] prices = {2, 4, 1};
        assertEquals(2, test.maxProfit(k, prices));
    }

    @Test
    void equalsSeven() {
        int k = 2;
        int[] prices = {3, 2, 6, 5, 0, 3};
        assertEquals(7, test.maxProfit(k, prices));
    }
}
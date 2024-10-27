/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/25 18:56
 */
class StockTest {
    private Stock test;

    @BeforeEach
    void setUp() {
        test = new Stock();
    }

    @Test
    void equalsSeven() {
        int[] prices = {3, 6, 2, 9, 8, 5};
        int expected = 7;
        assertEquals(expected, test.maxProfit(prices));
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e1475;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link FinalPricesWithASpecialDiscountOnAShop}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/18 08:49
 */
class FinalPricesWithASpecialDiscountOnAShopTest {
    private FinalPricesWithASpecialDiscountOnAShop test;

    @BeforeEach
    void setUp() {
        test = new FinalPricesWithASpecialDiscountOnAShop();
    }

    @Test
    void test1() {
        int[] prices = {8, 4, 6, 2, 3};
        int[] expected = {4, 2, 4, 2, 3};
        assertArrayEquals(expected, test.finalPrices(prices));
    }

    @Test
    void test2() {
        int[] prices = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, test.finalPrices(prices));
    }
}
/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m322;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link CoinChange}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/19 10:33
 */
class CoinChangeTest {
    private CoinChange test;

    @BeforeEach
    void setUp() {
        test = new CoinChange();
    }

    @Test
    void test1() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int expected = 3;
        assertEquals(expected, test.coinChange(coins, amount));
    }

    @Test
    void test2() {
        int[] coins = {2};
        int amount = 3;
        int expected = -1;
        assertEquals(expected, test.coinChange(coins, amount));
    }

    @Test
    void test3() {
        int[] coins = {1};
        int amount = 0;
        int expected = 0;
        assertEquals(expected, test.coinChange(coins, amount));
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/09 12:30
 */
class CoinChangeII_518Test {
    private CoinChangeII_518 test;

    @BeforeEach
    void setUp() {
        test = new CoinChangeII_518();
    }

    @Test
    void equalsFour() {
        int amount = 5;
        int[] coins = {1, 2, 5};
        assertEquals(4, test.change(amount, coins));
    }

    @Test
    void equalsZero() {
        int amount = 3;
        int[] coins = {2};
        assertEquals(0, test.change(amount, coins));
    }

    @Test
    void equalsOne() {
        int amount = 10;
        int[] coins = {10};
        assertEquals(1, test.change(amount, coins));
    }
}
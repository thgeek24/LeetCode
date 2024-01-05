/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link StoneGame_877}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/05 10:01
 */
class StoneGame_877Test {
    private StoneGame_877 test;

    @BeforeEach
    void setUp() {
        test = new StoneGame_877();
    }

    @Test
    void aliceWin() {
        int[] piles = {5, 3, 4, 5};
        assertTrue(test.stoneGame(piles));
    }

    @Test
    void aliceWin1() {
        int[] piles = {3, 7, 2, 3};
        assertTrue(test.stoneGame(piles));
    }
}
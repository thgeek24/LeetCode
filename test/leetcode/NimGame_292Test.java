/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NimGame_292}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/05 09:42
 */
class NimGame_292Test {
    private NimGame_292 test;

    @BeforeEach
    void setUp() {
        test = new NimGame_292();
    }

    @Test
    void fourShouldLose() {
        assertFalse(test.canWinNim(4));
    }

    @Test
    void oneShouldWin() {
        assertTrue(test.canWinNim(1));
    }

    @Test
    void twoShouldWin() {
        assertTrue(test.canWinNim(2));
    }
}
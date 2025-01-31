/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e292;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NimGame}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/31 17:13
 */
class NimGameTest {
    private NimGame nimGame;

    @BeforeEach
    void setUp() {
        nimGame = new NimGame();
    }

    @Test
    void test1() {
        assertFalse(nimGame.canWinNim(4));
    }

    @Test
    void test2() {
        assertTrue(nimGame.canWinNim(1));
    }

    @Test
    void test3() {
        assertTrue(nimGame.canWinNim(2));
    }
}
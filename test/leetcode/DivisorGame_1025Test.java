/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link DivisorGame_1025}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/09 11:20
 */
class DivisorGame_1025Test {
    private DivisorGame_1025 test;

    @BeforeEach
    void setUp() {
        test = new DivisorGame_1025();
    }

    @Test
    void aliceWin() {
        assertTrue(test.divisorGame(2));
    }

    @Test
    void aliceLose() {
        assertFalse(test.divisorGame(3));
    }
}
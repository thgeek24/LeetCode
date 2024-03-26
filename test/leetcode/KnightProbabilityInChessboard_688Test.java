/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link KnightProbabilityInChessboard_688}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/26 18:39
 */
class KnightProbabilityInChessboard_688Test {
    private KnightProbabilityInChessboard_688 test;

    @BeforeEach
    void setUp() {
        test = new KnightProbabilityInChessboard_688();
    }

    @Test
    void testOne() {
        assertEquals(0.06250d, test.knightProbability(3, 2, 0, 0));
    }

    @Test
    void testTwo() {
        assertEquals(1.0d, test.knightProbability(1, 0, 0, 0));
    }

    @Test
    void testThree() {
        double tolerance = 0.00001;
        double expected = 0.00019d;
        double actual = test.knightProbability(8, 30, 6, 4);
        double diff = Math.abs(actual - expected);
        assertTrue(diff < tolerance);
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h773;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SlidingPuzzle}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/25 10:35
 */
class SlidingPuzzleTest {
    private SlidingPuzzle test;

    @BeforeEach
    void setUp() {
        test = new SlidingPuzzle();
    }

    @Test
    void equalsOne() {
        int[][] board = {{1, 2, 3}, {4, 0, 5}};
        int expected = 1;
        assertEquals(expected, test.slidingPuzzle(board));
    }

    @Test
    void equalsMinusOne() {
        int[][] board = {{1, 2, 3}, {5, 4, 0}};
        int expected = -1;
        assertEquals(expected, test.slidingPuzzle(board));
    }

    @Test
    void equalsFive() {
        int[][] board = {{4, 1, 2}, {5, 0, 3}};
        int expected = 5;
        assertEquals(expected, test.slidingPuzzle(board));
    }
}
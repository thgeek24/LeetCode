/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m909;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link SnakesAndLadders}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/13 12:44
 */
class SnakesAndLaddersTest {
    private SnakesAndLadders test;

    @BeforeEach
    void setUp() {
        test = new SnakesAndLadders();
    }

    @Test
    void equalsFour() {
        int[][] board = {{-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}};
        int expected = 4;
        assertEquals(expected, test.snakesAndLadders(board));
    }

    @Test
    void equalsOne() {
        int[][] board = {{-1, -1}, {-1, 3}};
        int expected = 1;
        assertEquals(expected, test.snakesAndLadders(board));
    }

    @Test
    void equalsOne2() {
        int[][] board = {{-1, -1, -1}, {-1, 9, 8}, {-1, 8, 9}};
        int expected = 1;
        assertEquals(expected, test.snakesAndLadders(board));
    }
}
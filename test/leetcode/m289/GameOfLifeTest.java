/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m289;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link GameOfLife}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/27 09:30
 */
class GameOfLifeTest {
    private GameOfLife test;

    @BeforeEach
    void setUp() {
        test = new GameOfLife();
    }

    @Test
    void test1() {
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        test.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    @Test
    void test2() {
        int[][] board = {{1, 1}, {1, 0}};
        int[][] expected = {{1, 1}, {1, 1}};
        test.gameOfLife(board);
        assertArrayEquals(expected, board);
    }
}
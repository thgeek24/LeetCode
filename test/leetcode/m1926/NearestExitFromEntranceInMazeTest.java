/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1926;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link NearestExitFromEntranceInMaze}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 09:46
 */
class NearestExitFromEntranceInMazeTest {
    private NearestExitFromEntranceInMaze test;

    @BeforeEach
    void setUp() {
        test = new NearestExitFromEntranceInMaze();
    }

    @Test
    void equalsOne() {
        char[][] maze = {{'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '.'}};
        int[] entrance = {1, 2};
        int expected = 1;
        assertEquals(expected, test.nearestExit(maze, entrance));
    }

    @Test
    void equalsTwo() {
        char[][] maze = {{'+', '+', '+'},
                {'.', '.', '.'},
                {'+', '+', '+'}};
        int[] entrance = {1, 0};
        int expected = 2;
        assertEquals(expected, test.nearestExit(maze, entrance));
    }

    @Test
    void equalsMinusOne() {
        char[][] maze = {{'.', '+'}};
        int[] entrance = {0, 0};
        int expected = -1;
        assertEquals(expected, test.nearestExit(maze, entrance));
    }
}
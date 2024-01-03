/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link SurroundedRegion_130}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/04 10:52
 */
class SurroundedRegion_130Test {
    private final char[][] board = {{'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}};
    private final char[][] expectedBoard = {{'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'X', 'X'}};

    private final char[][] board1 = {{'O', 'X', 'X', 'O', 'X'},
            {'X', 'O', 'O', 'X', 'O'},
            {'X', 'O', 'X', 'O', 'X'},
            {'O', 'X', 'O', 'O', 'O'},
            {'X', 'X', 'O', 'X', 'O'}};

    private final char[][] expectedBoard1 = {{'O', 'X', 'X', 'O', 'X'},
            {'X', 'X', 'X', 'X', 'O'},
            {'X', 'X', 'X', 'O', 'X'},
            {'O', 'X', 'O', 'O', 'O'},
            {'X', 'X', 'O', 'X', 'O'}};

    private final char[][] board2 = {{'X', 'O', 'X', 'O', 'X', 'O', 'O', 'O', 'X', 'O'},
            {'X', 'O', 'O', 'X', 'X', 'X', 'O', 'O', 'O', 'X'},
            {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'X', 'X'},
            {'O', 'O', 'O', 'O', 'O', 'O', 'X', 'O', 'O', 'X'},
            {'O', 'O', 'X', 'X', 'O', 'X', 'X', 'O', 'O', 'O'},
            {'X', 'O', 'O', 'X', 'X', 'X', 'O', 'X', 'X', 'O'},
            {'X', 'O', 'X', 'O', 'O', 'X', 'X', 'O', 'X', 'O'},
            {'X', 'X', 'O', 'X', 'X', 'O', 'X', 'O', 'O', 'X'},
            {'O', 'O', 'O', 'O', 'X', 'O', 'X', 'O', 'X', 'O'},
            {'X', 'X', 'O', 'X', 'X', 'X', 'X', 'O', 'O', 'O'}};

    private final char[][] expectedBoard2 = {{'X', 'O', 'X', 'O', 'X', 'O', 'O', 'O', 'X', 'O'},
            {'X', 'O', 'O', 'X', 'X', 'X', 'O', 'O', 'O', 'X'},
            {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'X', 'X'},
            {'O', 'O', 'O', 'O', 'O', 'O', 'X', 'O', 'O', 'X'},
            {'O', 'O', 'X', 'X', 'O', 'X', 'X', 'O', 'O', 'O'},
            {'X', 'O', 'O', 'X', 'X', 'X', 'X', 'X', 'X', 'O'},
            {'X', 'O', 'X', 'X', 'X', 'X', 'X', 'O', 'X', 'O'},
            {'X', 'X', 'O', 'X', 'X', 'X', 'X', 'O', 'O', 'X'},
            {'O', 'O', 'O', 'O', 'X', 'X', 'X', 'O', 'X', 'O'},
            {'X', 'X', 'O', 'X', 'X', 'X', 'X', 'O', 'O', 'O'}};

    @Test
    void solveSuccessfully() {
        char[][] _board = board;
        char[][] _expectedBoard = expectedBoard;

        char[][] input = _board.clone();
        SurroundedRegion_130 test = new SurroundedRegion_130();
        test.solve(input);

        assertEquals(_expectedBoard.length, input.length);
        for (int i = 0; i < input.length; i++) {
            assertEquals(_expectedBoard[i].length, input[i].length);
            for (int j = 0; j < input[i].length; j++) {
                assertEquals(_expectedBoard[i][j], input[i][j]);
            }
        }
    }

    @Test
    void solveSuccessfully1() {
        char[][] _board = board1;
        char[][] _expectedBoard = expectedBoard1;

        char[][] input = _board.clone();
        SurroundedRegion_130 test = new SurroundedRegion_130();
        test.solve(input);

        assertEquals(_expectedBoard.length, input.length);
        for (int i = 0; i < input.length; i++) {
            assertEquals(_expectedBoard[i].length, input[i].length);
            for (int j = 0; j < input[i].length; j++) {
                assertEquals(_expectedBoard[i][j], input[i][j]);
            }
        }
    }

    @Test
    void solveSuccessfully2() {
        char[][] _board = board2;
        char[][] _expectedBoard = expectedBoard2;

        char[][] input = _board.clone();
        SurroundedRegion_130 test = new SurroundedRegion_130();
        test.solve(input);

        assertEquals(_expectedBoard.length, input.length);
        for (int i = 0; i < input.length; i++) {
            assertEquals(_expectedBoard[i].length, input[i].length);
            for (int j = 0; j < input[i].length; j++) {
                assertEquals(_expectedBoard[i][j], input[i][j]);
            }
        }
    }
}
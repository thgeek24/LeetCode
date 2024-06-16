/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NumberOfIslands_200}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/06/14 16:30
 */
class NumberOfIslands_200Test {
    private NumberOfIslands_200 test;

    @BeforeEach
    void setUp() throws Exception {
        test = new NumberOfIslands_200();
    }

    @Test
    void equalsOne() {
        char[][] grid = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int actual = test.numIslands(grid);
        assertEquals(1, actual);
    }

    @Test
    void equalsThree() {
        char[][] grid = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        int actual = test.numIslands(grid);
        assertEquals(3, actual);
    }
}
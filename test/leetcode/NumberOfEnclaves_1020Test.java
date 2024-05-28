/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NumberOfEnclaves_1020}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/05/28 09:07
 */
class NumberOfEnclaves_1020Test {
    private NumberOfEnclaves_1020 test;

    @BeforeEach
    void setUp() {
        test = new NumberOfEnclaves_1020();
    }

    @Test
    void equalsThree() {
        int[][] grid = {{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        int actual = test.numEnclaves(grid);
        assertEquals(3, actual);
    }

    @Test
    void equalsZero() {
        int[][] grid = {{0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}};
        int actual = test.numEnclaves(grid);
        assertEquals(0, actual);
    }
}
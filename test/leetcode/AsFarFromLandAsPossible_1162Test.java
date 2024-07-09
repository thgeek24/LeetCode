/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link AsFarFromLandAsPossible_1162}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/06 20:06
 */
class AsFarFromLandAsPossible_1162Test {
    private AsFarFromLandAsPossible_1162 test;

    @BeforeEach
    void setUp() {
        test = new AsFarFromLandAsPossible_1162();
    }

    @Test
    void equalsTwo() {
        int[][] grid = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        int actual = test.maxDistance(grid);
        assertEquals(2, actual);
    }

    @Test
    void equalsFour() {
        int[][] grid = {{1, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int actual = test.maxDistance(grid);
        assertEquals(4, actual);
    }
}
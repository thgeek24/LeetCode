/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MostStonesRemovedWithSameRowOrColumn_947}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/28 10:36
 */
class MostStonesRemovedWithSameRowOrColumn_947Test {
    private MostStonesRemovedWithSameRowOrColumn_947 test;

    @BeforeEach
    void setUp() {
        test = new MostStonesRemovedWithSameRowOrColumn_947();
    }

    @Test
    void equalsFive() {
        int[][] stones = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
        assertEquals(5, test.removeStones(stones));
    }

    @Test
    void equalsThree() {
        int[][] stones = {{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}};
        assertEquals(3, test.removeStones(stones));
    }

    @Test
    void equalsZero() {
        int[][] stones = {{0, 0}};
        assertEquals(0, test.removeStones(stones));
    }
}
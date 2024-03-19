/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link DungeonGame_174}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/19 17:12
 */
class DungeonGame_174Test {
    private DungeonGame_174 test;

    @BeforeEach
    void setUp() {
        test = new DungeonGame_174();
    }

    @Test
    void equalsSeven() {
        int[][] dungeon = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        assertEquals(7, test.calculateMinimumHP(dungeon));
    }

    @Test
    void equalsOne() {
        int[][] dungeon = {{0}};
        assertEquals(1, test.calculateMinimumHP(dungeon));
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RegionsCutBySlashes_959}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/30 10:29
 */
class RegionsCutBySlashes_959Test {
    private RegionsCutBySlashes_959 test;

    @BeforeEach
    void setUp() {
        test = new RegionsCutBySlashes_959();
    }

    @Test
    void equalsTwo() {
        String[] grid = {" /", "/ "};
        assertEquals(2, test.regionsBySlashes(grid));
    }

    @Test
    void equalsOne() {
        String[] grid = {" /", "  "};
        assertEquals(1, test.regionsBySlashes(grid));
    }

    @Test
    void equalsFive() {
        String[] grid = {"/\\", "\\/"};
        assertEquals(5, test.regionsBySlashes(grid));
    }
}
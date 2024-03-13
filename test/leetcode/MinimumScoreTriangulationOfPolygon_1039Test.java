/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link  MinimumScoreTriangulationOfPolygon_1039}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/12 10:12
 */
class MinimumScoreTriangulationOfPolygon_1039Test {
    private MinimumScoreTriangulationOfPolygon_1039 test;

    @BeforeEach
    void setUp() {
        test = new MinimumScoreTriangulationOfPolygon_1039();
    }

    @Test
    void equalsSix() {
        int[] values = {1, 2, 3};
        assertEquals(6, test.minScoreTriangulation(values));
    }

    @Test
    void equalsOneFourFour() {
        int[] values = {3, 7, 4, 5};
        assertEquals(144, test.minScoreTriangulation(values));
    }

    @Test
    void equalsThirteen() {
        int[] values = {1, 3, 1, 4, 1, 5};
        assertEquals(13, test.minScoreTriangulation(values));
    }
}
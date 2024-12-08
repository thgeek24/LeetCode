/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w427;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaximumAreaRectangleWithPointConstraintsI}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/08 10:57
 */
class MaximumAreaRectangleWithPointConstraintsITest {
    private MaximumAreaRectangleWithPointConstraintsI test;

    @BeforeEach
    void setUp() {
        test = new MaximumAreaRectangleWithPointConstraintsI();
    }

    @Test
    void equalsFour() {
        int[][] points = {{1, 1}, {1, 3}, {3, 1}, {3, 3}};
        int expected = 4;
        assertEquals(expected, test.maxRectangleArea(points));
    }

    @Test
    void equalsMinusOne() {
        int[][] points = {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {2, 2}};
        int expected = -1;
        assertEquals(expected, test.maxRectangleArea(points));
    }

    @Test
    void equalsTwo() {
        int[][] points = {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {1, 2}, {3, 2}};
        int expected = 2;
        assertEquals(expected, test.maxRectangleArea(points));
    }
}
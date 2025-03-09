/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w427;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link MaximumAreaRectangleWithPointConstraintsI}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/08 10:57
 */
class MaximumAreaRectangleWithPointConstraintsITest {
    private List<MaximumAreaRectangleWithPointConstraintsI> tests;

    @BeforeEach
    void setUp() {
        tests = Arrays.asList(new MaximumAreaRectangleWithPointConstraintsI.Solution1(), new MaximumAreaRectangleWithPointConstraintsI.Solution2());
    }

    @Test
    void equalsFour() {
        int[][] points = {{1, 1}, {1, 3}, {3, 1}, {3, 3}};
        int expected = 4;
        tests.forEach(test -> assertEquals(expected, test.maxRectangleArea(points)));
    }

    @Test
    void equalsMinusOne() {
        int[][] points = {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {2, 2}};
        int expected = -1;
        tests.forEach(test -> assertEquals(expected, test.maxRectangleArea(points)));
    }

    @Test
    void equalsTwo() {
        int[][] points = {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {1, 2}, {3, 2}};
        int expected = 2;
        tests.forEach(test -> assertEquals(expected, test.maxRectangleArea(points)));
    }

    @Test
    void equalsThirtyThree() {
        int[][] points = {{100, 80}, {67, 79}, {100, 79}, {67, 80}, {80, 47}};
        int expected = 33;
        tests.forEach(test -> assertEquals(expected, test.maxRectangleArea(points)));
    }

    @Test
    void equalsMinusOne2() {
        int[][] points = {{96, 44}, {23, 72}, {96, 72}, {23, 44}, {65, 44}};
        int expected = -1;
        tests.forEach(test -> assertEquals(expected, test.maxRectangleArea(points)));
    }

    @Test
    void equalsMinusOne3() {
        int[][] points = {{87, 89}, {22, 77}, {87, 77}, {87, 52}, {22, 93}, {87, 93}};
        int expected = -1;
        tests.forEach(test -> assertEquals(expected, test.maxRectangleArea(points)));
    }
}
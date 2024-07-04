/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link CourseScheduleII_210}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/04 17:35
 */
class CourseScheduleII_210Test {
    private static CourseScheduleII_210 test;

    @BeforeAll
    public static void setUp() throws Exception {
        test = new CourseScheduleII_210();
    }

    @Test
    void test1() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        int[] actual = test.findOrder(numCourses, prerequisites);
        int[] expected = {0, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] actual = test.findOrder(numCourses, prerequisites);
        int[] expected1 = {0, 2, 1, 3};
        int[] expected2 = {0, 1, 2, 3};
        boolean result = Arrays.equals(expected1, actual) || Arrays.equals(expected2, actual);
        assertTrue(result);
    }

    @Test
    void test3() {
        int numCourses = 1;
        int[][] prerequisites = {};
        int[] actual = test.findOrder(numCourses, prerequisites);
        int[] expected = {0};
        assertArrayEquals(expected, actual);
    }
}
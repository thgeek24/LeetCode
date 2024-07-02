/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link CourseSchedule_207}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/02 15:56
 */
class CourseSchedule_207Test {
    private static CourseSchedule_207 test;

    @BeforeAll
    public static void setUp() throws Exception {
        test = new CourseSchedule_207();
    }

    @Test
    void canFinish() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        assertTrue(test.canFinish(numCourses, prerequisites));
    }

    @Test
    void cannotFinish() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        assertFalse(test.canFinish(numCourses, prerequisites));
    }
}
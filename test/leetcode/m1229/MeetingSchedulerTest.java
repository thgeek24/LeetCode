/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1229;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MeetingScheduler}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/02 16:14
 */
class MeetingSchedulerTest {
    private MeetingScheduler test;

    @BeforeEach
    void setUp() {
        test = new MeetingScheduler();
    }

    @Test
    void test1() {
        int[][] slots1 = {{10, 50}, {60, 120}, {140, 210}};
        int[][] slots2 = {{0, 15}, {60, 70}};
        int duration = 8;
        List<Integer> expected = Arrays.asList(60, 68);
        assertEquals(expected, test.minAvailableDuration(slots1, slots2, duration));
    }

    @Test
    void test2() {
        int[][] slots1 = {{10, 50}, {60, 120}, {140, 210}};
        int[][] slots2 = {{0, 15}, {60, 70}};
        int duration = 12;
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, test.minAvailableDuration(slots1, slots2, duration));
    }

    @Test
    void test3() {
        int[][] slots1 = {{0, 2}};
        int[][] slots2 = {{1, 3}};
        int duration = 1;
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, test.minAvailableDuration(slots1, slots2, duration));
    }

    @Test
    void test4() {
        int[][] slots1 = {{10, 60}};
        int[][] slots2 = {{12, 17}, {21, 50}};
        int duration = 8;
        List<Integer> expected = Arrays.asList(21, 29);
        assertEquals(expected, test.minAvailableDuration(slots1, slots2, duration));
    }
}
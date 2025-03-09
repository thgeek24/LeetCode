/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/31 15:54
 */
class TaskScheduler_621Test {
    private TaskScheduler_621 test;

    @BeforeEach
    void setUp() {
        test = new TaskScheduler_621();
    }

    @Test
    void equalsEight() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        assertEquals(8, test.leastInterval(tasks, n));
    }

    @Test
    void equalsSix() {
        char[] tasks = {'A', 'C', 'A', 'B', 'D', 'B'};
        int n = 1;
        assertEquals(6, test.leastInterval(tasks, n));
    }

    @Test
    void equalsTen() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 3;
        assertEquals(10, test.leastInterval(tasks, n));
    }

    @Test
    void equalsTwelve() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'E'};
        int n = 2;
        assertEquals(12, test.leastInterval(tasks, n));
    }
}
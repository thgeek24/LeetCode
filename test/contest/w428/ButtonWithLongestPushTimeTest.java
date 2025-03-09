/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w428;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ButtonWithLongestPushTime}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/15 10:35
 */
class ButtonWithLongestPushTimeTest {
    private ButtonWithLongestPushTime test;

    @BeforeEach
    void setUp() {
        test = new ButtonWithLongestPushTime();
    }

    @Test
    void test1() {
        int[][] events = {{1, 2}, {2, 5}, {3, 9}, {1, 15}};
        int expected = 1;
        assertEquals(expected, test.buttonWithLongestTime(events));
    }

    @Test
    void test2() {
        int[][] events = {{10, 5}, {1, 7}};
        int expected = 10;
        assertEquals(expected, test.buttonWithLongestTime(events));
    }

    @Test
    void test3() {
        int[][] events = {{7, 1}, {19, 3}, {9, 4}, {12, 5}, {2, 8}, {15, 10}, {18, 12}, {7, 14}, {19, 16}};
        int expected = 2;
        assertEquals(expected, test.buttonWithLongestTime(events));
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link FindEventualSafeStates_802}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/06/20 17:55
 */
class FindEventualSafeStates_802Test {
    private FindEventualSafeStates_802 test;

    @BeforeEach
    void setUp() {
        test = new FindEventualSafeStates_802();
    }

    @Test
    void test1() {
        int[][] graph = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        List<Integer> actual = test.eventualSafeNodes(graph);
        List<Integer> expected = Arrays.asList(2, 4, 5, 6);
        assertTrue(ListComparator.equals(expected, actual));
    }

    @Test
    void test2() {
        int[][] graph = {{1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}};
        List<Integer> actual = test.eventualSafeNodes(graph);
        List<Integer> expected = Collections.singletonList(4);
        assertTrue(ListComparator.equals(expected, actual));
    }

}
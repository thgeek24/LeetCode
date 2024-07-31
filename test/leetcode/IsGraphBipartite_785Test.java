/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link IsGraphBipartite_785}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/15 22:19
 */
class IsGraphBipartite_785Test {
    private IsGraphBipartite_785 test;

    @BeforeEach
    void setUp() {
        test = new IsGraphBipartite_785();
    }

    @Test
    void isFalse() {
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        boolean actual = test.isBipartite(graph);
        assertFalse(actual);
    }

    @Test
    void isTrue() {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        boolean actual = test.isBipartite(graph);
        assertTrue(actual);
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link PossibleBipartition_886}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/13 17:32
 */
class PossibleBipartition_886Test {
    private PossibleBipartition_886 test;

    @BeforeEach
    void setUp() {
        test = new PossibleBipartition_886();
    }

    @Test
    void isTrue() {
        int n = 4;
        int[][] dislikes = {{1, 2}, {1, 3}, {2, 4}};
        assertTrue(test.possibleBipartition(n, dislikes));
    }

    @Test
    void isFalse() {
        int n = 3;
        int[][] dislikes = {{1, 2}, {1, 3}, {2, 3}};
        assertFalse(test.possibleBipartition(n, dislikes));
    }
}
/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaximumLengthOfPairChain_646}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/11 11:55
 */
class MaximumLengthOfPairChain_646Test {
    private MaximumLengthOfPairChain_646 test;

    @BeforeEach
    void setUp() {
        test = new MaximumLengthOfPairChain_646();
    }

    @Test
    void equalsTwo() {
        int[][] pairs = {{1, 2}, {2, 3}, {3, 4}};
        int two = test.findLongestChain(pairs);
        assertEquals(2, two);
    }

    @Test
    void equalsThree() {
        int[][] pairs = {{1, 2}, {7, 8}, {4, 5}};
        int three = test.findLongestChain(pairs);
        assertEquals(3, three);
    }

    @Test
    void equalsTwo_2() {
        int[][] pairs = {{9, 10}, {-4, 9}, {-5, 6}, {-5, 9}, {8, 9}};
        int two = test.findLongestChain(pairs);
        assertEquals(2, two);
    }
}